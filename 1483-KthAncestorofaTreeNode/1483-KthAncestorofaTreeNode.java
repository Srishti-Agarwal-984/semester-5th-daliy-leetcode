// Last updated: 1/25/2026, 5:39:01 PM
1class TreeAncestor {
2    int[][] up;
3    int LOG = 17;
4
5    public TreeAncestor(int n, int[] parent) {
6        up = new int[n][LOG];
7
8        for (int i = 0; i < n; i++)
9            up[i][0] = parent[i];
10
11        for (int j = 1; j < LOG; j++) {
12            for (int i = 0; i < n; i++) {
13                if (up[i][j - 1] == -1)
14                    up[i][j] = -1;
15                else
16                    up[i][j] = up[up[i][j - 1]][j - 1];
17            }
18        }
19    }
20
21    public int getKthAncestor(int node, int k) {
22        for (int j = 0; j < LOG; j++) {
23            if (((k >> j) & 1) == 1) {
24                node = up[node][j];
25                if (node == -1) return -1;
26            }
27        }
28        return node;
29    }
30}
31