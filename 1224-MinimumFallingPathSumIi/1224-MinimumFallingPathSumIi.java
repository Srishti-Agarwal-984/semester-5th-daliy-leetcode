// Last updated: 7/31/2025, 5:31:55 PM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if(matrix.length==1){
            return matrix[0][0];
        }
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
        for(int temp=0; temp<matrix.length; temp++){
            if(temp!=col){
                int r = helper(matrix, temp, row+1,dp);
                left = Math.min(left, r);
            }

        }
        dp[row][col]=left+matrix[row][col];
        //System.out.println(dp[row][col]+" "+row+" "+col);
        return left+matrix[row][col];

    }
}