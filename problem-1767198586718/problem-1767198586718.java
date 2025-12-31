// Last updated: 12/31/2025, 9:59:46 PM
1class Solution {
2    int n, m;
3    int orig;
4    boolean[][] vis;
5    boolean[][] isBorder;
6
7    int[] dr = {0, -1, 0, 1};
8    int[] dc = {-1, 0, 1, 0};
9
10    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
11        n = grid.length;
12        m = grid[0].length;
13        orig = grid[row][col];
14
15        vis = new boolean[n][m];
16        isBorder = new boolean[n][m];
17
18        Stack<Pair> st = new Stack<>();
19        st.push(new Pair(row, col));
20
21        while (!st.isEmpty()) {
22            Pair cur = st.pop();
23            int r = cur.r, c = cur.c;
24
25            if (vis[r][c]) continue;
26            vis[r][c] = true;
27
28            boolean border = false;
29
30            for (int k = 0; k < 4; k++) {
31                int nr = r + dr[k];
32                int nc = c + dc[k];
33
34                // Out of bounds → border
35                if (nr < 0 || nc < 0 || nr >= n || nc >= m) {
36                    border = true;
37                }
38                // Different color → border
39                else if (grid[nr][nc] != orig) {
40                    border = true;
41                }
42                // Same component → DFS
43                else if (!vis[nr][nc]) {
44                    st.push(new Pair(nr, nc));
45                }
46            }
47
48            if (border) {
49                isBorder[r][c] = true;
50            }
51        }
52
53        // Color only border cells
54        for (int i = 0; i < n; i++) {
55            for (int j = 0; j < m; j++) {
56                if (isBorder[i][j]) {
57                    grid[i][j] = color;
58                }
59            }
60        }
61
62        return grid;
63    }
64
65    class Pair {
66        int r, c;
67        Pair(int r, int c) {
68            this.r = r;
69            this.c = c;
70        }
71    }
72}
73