// Last updated: 1/18/2026, 4:21:31 PM
1class Solution {
2    public int largestMagicSquare(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        int[][] row = new int[m][n + 1];
6        int[][] col = new int[m + 1][n];
7        int[][] diag1 = new int[m + 1][n + 1];
8        int[][] diag2 = new int[m + 1][n + 1];
9
10        // prefix sums
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                row[i][j + 1] = row[i][j] + grid[i][j];
14                col[i + 1][j] = col[i][j] + grid[i][j];
15                diag1[i + 1][j + 1] = diag1[i][j] + grid[i][j];
16                diag2[i + 1][j] = diag2[i][j + 1] + grid[i][j];
17            }
18        }
19
20        for (int size = Math.min(m, n); size >= 1; size--) {
21            for (int i = 0; i + size <= m; i++) {
22                for (int j = 0; j + size <= n; j++) {
23                    if (isMagic(i, j, size, row, col, diag1, diag2))
24                        return size;
25                }
26            }
27        }
28        return 1;
29    }
30
31    private boolean isMagic(int r, int c, int len,
32                            int[][] row, int[][] col,
33                            int[][] d1, int[][] d2) {
34
35        int target = row[r][c + len] - row[r][c];
36
37        // rows
38        for (int i = r; i < r + len; i++) {
39            if (row[i][c + len] - row[i][c] != target)
40                return false;
41        }
42
43        // cols
44        for (int j = c; j < c + len; j++) {
45            if (col[r + len][j] - col[r][j] != target)
46                return false;
47        }
48
49        // diagonals
50        if (d1[r + len][c + len] - d1[r][c] != target)
51            return false;
52
53        if (d2[r + len][c] - d2[r][c + len] != target)
54            return false;
55
56        return true;
57    }
58}
59