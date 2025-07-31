// Last updated: 7/31/2025, 5:32:33 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                dp[i][j] = Integer.MAX_VALUE;

            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int s = helper(matrix, i, 0,dp);
            ans = Math.min(s, ans);
        }
        return ans;
    }

    public static int helper(int[][] matrix, int col, int row,int[][] dp) {
        if (row >= matrix.length) {
            return 0;
        }
        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int center = Integer.MAX_VALUE;
        if (col > 0) {
            left = helper(matrix, col - 1, row + 1,dp) + matrix[row][col];
        }
        if (col < matrix.length - 1) {
            right = helper(matrix, col + 1, row + 1,dp) + matrix[row][col];
        }
        center = helper(matrix, col, row + 1,dp) + matrix[row][col];
        dp[row][col]=Math.min(center, Math.min(right, left));
        return Math.min(center, Math.min(right, left));

    }
}