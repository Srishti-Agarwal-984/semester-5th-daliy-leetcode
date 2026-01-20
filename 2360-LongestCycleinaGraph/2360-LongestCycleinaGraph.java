// Last updated: 1/21/2026, 12:15:51 AM
1class Solution {
2    public int longestCycle(int[] edges) {
3        return helper(edges);
4    }
5
6    public int helper(int[] edges) {
7        int n = edges.length;
8        int[] indeg = new int[n];
9        for (int i = 0; i < n; i++) {
10            if (edges[i] != -1) {
11                indeg[edges[i]]++;
12            }
13        }
14        Queue<Integer> q = new LinkedList<>();
15        for (int i = 0; i < n; i++) {
16            if (indeg[i] == 0) {
17                q.add(i);
18            }
19        }
20
21        boolean[] vis = new boolean[n];
22        while (!q.isEmpty()) {
23            int node = q.poll();
24            vis[node] = true;
25            int nbrs = edges[node];
26            if (nbrs != -1) {
27                indeg[nbrs]--;
28                if (indeg[nbrs] == 0) {
29                    q.add(nbrs);
30                }
31            }
32
33        }
34
35        int ans = -1;
36        for (int i = 0; i < n; i++) {
37            if (vis[i] == false) {
38                int cnt = 1;
39                int nbrs = edges[i];
40                while (nbrs != i) {
41                    cnt++;
42                    vis[nbrs] = true;
43                    nbrs = edges[nbrs];
44                }
45                ans = Math.max(ans, cnt);
46            }
47        }
48        return ans;
49    }
50}