// Last updated: 1/4/2026, 2:05:39 PM
1class Solution {
2    class Pair {
3        int node;
4        long dist;
5        Pair(int n, long d) {
6            node = n;
7            dist = d;
8        }
9    }
10
11    public int countPaths(int n, int[][] roads) {
12        int mod = 1_000_000_007;
13
14        // adjacency list
15        List<List<Pair>> graph = new ArrayList<>();
16        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
17
18        for (int[] r : roads) {
19            graph.get(r[0]).add(new Pair(r[1], r[2]));
20            graph.get(r[1]).add(new Pair(r[0], r[2]));
21        }
22
23        long[] dist = new long[n];
24        Arrays.fill(dist, Long.MAX_VALUE);
25        dist[0] = 0;
26
27        int[] ways = new int[n];
28        ways[0] = 1;
29
30        PriorityQueue<Pair> pq =
31            new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
32        pq.add(new Pair(0, 0));
33
34        while (!pq.isEmpty()) {
35            Pair cur = pq.poll();
36            int u = cur.node;
37            long d = cur.dist;
38
39            if (d > dist[u]) continue;
40
41            for (Pair nxt : graph.get(u)) {
42                int v = nxt.node;
43                long nd = d + nxt.dist;
44
45                if (nd < dist[v]) {
46                    dist[v] = nd;
47                    ways[v] = ways[u];
48                    pq.add(new Pair(v, nd));
49                } 
50                else if (nd == dist[v]) {
51                    ways[v] = (ways[v] + ways[u]) % mod;
52                }
53            }
54        }
55
56        return ways[n - 1];
57    }
58}
59