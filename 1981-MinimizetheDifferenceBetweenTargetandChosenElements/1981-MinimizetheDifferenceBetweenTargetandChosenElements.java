// Last updated: 1/24/2026, 7:56:57 PM
1class Solution {
2    public int minimizeTheDifference(int[][] mat, int target) {
3        int[][] dp = new int[mat.length][5000];
4        for (int[] row : dp) Arrays.fill(row, -1);
5        return helper(mat, 0, target, 0, dp);
6    }
7
8    public int helper(int[][] mat, int i, int target, int cal, int[][] dp) {
9        //if (cal > 1400) return 1400;   // pruning
10
11        if (i == mat.length) {
12            return Math.abs(cal - target);
13        }
14
15        if (dp[i][cal] != -1) {
16            return dp[i][cal];
17        }
18
19        int ans = 4999;
20        for (int j = 0; j < mat[i].length; j++) {
21            ans = Math.min(
22                ans,
23                helper(mat, i + 1, target, cal + mat[i][j], dp)
24            );
25        }
26
27        return dp[i][cal] = ans;
28    }
29}
30