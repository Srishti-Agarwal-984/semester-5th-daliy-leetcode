// Last updated: 12/31/2025, 8:18:57 AM
1class Solution {
2    int[] dr = {1, -1, 0, 0};
3    int[] dc = {0, 0, 1, -1};
4
5    public int latestDayToCross(int row, int col, int[][] cells) {
6        int lo = 0, hi = cells.length, ans = 0;
7
8        while (lo <= hi) {
9            int mid = lo + (hi - lo) / 2;
10            if (canCross(row, col, cells, mid)) {
11                ans = mid;
12                lo = mid + 1;
13            } else {
14                hi = mid - 1;
15            }
16        }
17        return ans;
18    }
19
20    private boolean canCross(int row, int col, int[][] cells, int day) {
21        int[][] grid = new int[row][col];
22
23        // flood first "day" cells
24        for (int i = 0; i < day; i++) {
25            int r = cells[i][0] - 1;
26            int c = cells[i][1] - 1;
27            grid[r][c] = 1;
28        }
29
30        Queue<int[]> q = new LinkedList<>();
31        boolean[][] vis = new boolean[row][col];
32
33        // start from top row
34        for (int c = 0; c < col; c++) {
35            if (grid[0][c] == 0) {
36                q.add(new int[]{0, c});
37                vis[0][c] = true;
38            }
39        }
40
41        while (!q.isEmpty()) {
42            int[] cur = q.poll();
43            int r = cur[0], c = cur[1];
44
45            if (r == row - 1) return true;
46
47            for (int k = 0; k < 4; k++) {
48                int nr = r + dr[k];
49                int nc = c + dc[k];
50
51                if (nr >= 0 && nc >= 0 && nr < row && nc < col &&
52                    !vis[nr][nc] && grid[nr][nc] == 0) {
53
54                    vis[nr][nc] = true;
55                    q.add(new int[]{nr, nc});
56                }
57            }
58        }
59        return false;
60    }
61}
62