// Last updated: 12/28/2025, 5:21:39 PM
1class Solution {
2    public void solve(char[][] board) {
3        if (board == null || board.length == 0) return;
4
5        int m = board.length;
6        int n = board[0].length;
7
8        // Step 1: Run DFS from border 'O's
9        for (int i = 0; i < m; i++) {
10            if (board[i][0] == 'O') dfs(board, i, 0);
11            if (board[i][n - 1] == 'O') dfs(board, i, n - 1);
12        }
13
14        for (int j = 0; j < n; j++) {
15            if (board[0][j] == 'O') dfs(board, 0, j);
16            if (board[m - 1][j] == 'O') dfs(board, m - 1, j);
17        }
18
19        // Step 2: Flip surrounded regions
20        for (int i = 0; i < m; i++) {
21            for (int j = 0; j < n; j++) {
22                if (board[i][j] == 'O') board[i][j] = 'X';
23                if (board[i][j] == '#') board[i][j] = 'O';
24            }
25        }
26    }
27
28    private void dfs(char[][] board, int i, int j) {
29        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
30            return;
31        if (board[i][j] != 'O') return;
32
33        board[i][j] = '#'; // mark as safe
34
35        dfs(board, i + 1, j);
36        dfs(board, i - 1, j);
37        dfs(board, i, j + 1);
38        dfs(board, i, j - 1);
39    }
40}
41