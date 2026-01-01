// Last updated: 1/1/2026, 6:29:30 PM
1class Solution {
2    int mod = 1000000007;
3
4    public class Pair {
5        int vtx;
6        long cost;
7
8        public Pair(int vtx, long cost) {
9            this.vtx = vtx;
10            this.cost = cost;
11        }
12    }
13
14    public int countRestrictedPaths(int n, int[][] edges) {
15        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
16        for (int i = 1; i <= n; i++) {
17            map.put(i, new HashMap<>());
18        }
19        for (int[] arr : edges) {
20            int a = arr[0];
21            int b = arr[1];
22            int cost = arr[2];
23            map.get(a).put(b, cost);
24            map.get(b).put(a, cost);
25        }
26
27        long[] dis = new long[n + 1];
28        Arrays.fill(dis, Long.MAX_VALUE);
29        dijkstra(map, dis);
30        int[] dp = new int[n + 1];
31        Arrays.fill(dp, -1);
32        return dfs(1, n, dp, map, dis);
33    }
34
35    public void dijkstra(HashMap<Integer, HashMap<Integer, Integer>> map, long[] dis) {
36        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
37            @Override
38            public int compare(Pair o1, Pair o2) {
39                return Long.compare(o1.cost, o2.cost);
40            }
41        });
42        int n = dis.length - 1;
43        dis[n] = 0;
44        pq.add(new Pair(n, 0));
45        while (!pq.isEmpty()) {
46            Pair rv = pq.poll();
47            int vtx = rv.vtx;
48            long cost = rv.cost;
49            if (cost > dis[vtx]) continue;
50
51            for (int nbrs : map.get(vtx).keySet()) {
52                long c = map.get(vtx).get(nbrs) + cost;
53                if (c < dis[nbrs]) {
54                    dis[nbrs] = c;
55                    pq.add(new Pair(nbrs, c));
56                }
57            }
58        }
59    }
60
61    public int dfs(int node, int n, int[] dp, HashMap<Integer, HashMap<Integer, Integer>> map, long[] dis) {
62        if (node == n) {
63            return 1;
64        }
65        if (dp[node] != -1) {
66            return dp[node];
67        }
68
69        long a = 0;
70        for (int nbrs : map.get(node).keySet()) {
71
72            if (dis[node] > dis[nbrs]) {
73                a = (a + dfs(nbrs, n, dp, map, dis)) % mod;
74            }
75        }
76        return dp[node] = (int) (a % mod);
77    }
78}