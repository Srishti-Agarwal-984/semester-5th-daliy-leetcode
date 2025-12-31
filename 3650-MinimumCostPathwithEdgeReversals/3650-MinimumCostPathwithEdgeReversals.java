// Last updated: 12/31/2025, 3:05:33 PM
1class Solution {
2    public int minCost(int n, int[][] edges) {
3        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
4        for (int i = 0; i < n; i++) {
5            map.put(i, new HashMap<>());
6        }
7        for (int[] e : edges) {
8            int r =e[2];
9            if(map.get(e[0]).containsKey(e[1])){
10                r = Math.min(map.get(e[0]).get(e[1]), r);
11            }
12            
13            map.get(e[0]).put(e[1],r);
14            r = 2*e[2];
15            if(map.get(e[1]).containsKey(e[0])){
16                r = Math.min(map.get(e[1]).get(e[0]), r);
17            }
18            map.get(e[1]).put(e[0], r);
19        }
20
21        PriorityQueue<Pair> pq = new PriorityQueue<>(
22            (a, b) -> Integer.compare(a.val, b.val)
23        );
24
25        int[] dist = new int[n];
26        Arrays.fill(dist, 1000000000);
27        dist[0] = 0;
28
29        boolean[] visited = new boolean[n];
30        pq.add(new Pair(0, 0));
31
32        while (!pq.isEmpty()) {
33            Pair cur = pq.poll();
34            int u = cur.e2;
35
36            if (visited[u]) continue;
37            visited[u] = true;
38
39            for (int v : map.get(u).keySet()) {
40                int w = map.get(u).get(v);
41                if (!visited[v]  && dist[u] + w<dist[v] ) {
42                    dist[v] = dist[u] + w;
43                    pq.add(new Pair(v, dist[v]));
44                }
45            }
46        }
47
48        return dist[n - 1] >= 1000000000 ? -1 : dist[n - 1];
49    }
50
51    class Pair {
52        int e2, val;
53        Pair(int e2, int val) {
54            this.e2 = e2;
55            this.val = val;
56        }
57    }
58}
59