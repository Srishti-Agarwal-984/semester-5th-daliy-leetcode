// Last updated: 1/26/2026, 12:07:57 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<Integer>[] adj = new ArrayList[n];
4        for (int i = 0; i < n; i++) {
5            adj[i] = new ArrayList<>();
6        }
7        for (int []e : edges) {
8            adj[e[0]].add(e[1]);
9            adj[e[1]].add(e[0]);
10        }
11        int[] dx = bfs(n, adj, x);
12        int[] dy = bfs(n, adj, y);
13        int[] dz = bfs(n, adj, z);
14        int ans = 0;
15        for (int i = 0; i < n; i++) {
16            int a = dx[i], b = dy[i], c = dz[i];
17            int min = Math.min(a, Math.min(b, c));
18            int max = Math.max(a, Math.max(b, c));
19            int mid = a + b + c - min - max;
20            if (min * min + mid * mid == max * max) {
21                ans++;
22            }
23        }
24        return ans;
25    }
26
27    public int[] bfs(int n, List<Integer>[] adj, int src){
28        int[] dist = new int[n];
29        Arrays.fill(dist,-1);
30        Queue<Integer> q = new LinkedList<>();
31        q.add(src);
32        dist[src] = 0;
33        while(!q.isEmpty()){
34            int u = q.poll();
35        
36                for(int v : adj[u]){
37                    if(dist[v] == -1){
38                        dist[v] = 1+dist[u];
39                        q.add(v);
40                    }
41                }
42        }
43        return dist ;
44    }
45}