// Last updated: 1/21/2026, 11:10:28 PM
1class Solution {
2    private static final int INF = Integer.MAX_VALUE;
3    public int largestPathValue(String colors, int[][] edges) {
4        int n = colors.length();
5        List<List<Integer>> adj = new ArrayList<>();
6        for (int i = 0; i < n; i++)
7            adj.add(new ArrayList<>());
8        for (int[] e : edges)
9            adj.get(e[0]).add(e[1]);
10            
11        int[][] count = new int[n][26];
12        int[] vis = new int[n];
13        int ans = 0;
14
15        for (int i = 0; i < n && ans != INF; i++) {
16            ans = Math.max(ans, dfs(i, colors, adj, count, vis));
17        }
18        return ans == INF ? -1 : ans;
19    }
20
21    private int dfs(int node, String colors,List<List<Integer>> adj,int[][] count,int[] vis) {
22        if (vis[node] == 1)
23            return INF;
24        if (vis[node] == 2) {
25            return count[node][colors.charAt(node) - 'a'];
26        }
27
28        vis[node] = 1;
29        for (int nxt : adj.get(node)) {
30            int res = dfs(nxt, colors, adj, count, vis);
31            if (res == INF)
32                return INF;
33            for (int c = 0; c < 26; c++) {
34                count[node][c] = Math.max(count[node][c], count[nxt][c]);
35            }
36        }
37        int col = colors.charAt(node) - 'a';
38        count[node][col]++;
39        vis[node] = 2;
40
41        return count[node][col];
42    }
43}