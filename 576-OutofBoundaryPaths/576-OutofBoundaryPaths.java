// Last updated: 11/4/2025, 2:05:27 PM
class Solution {
    int mod = 1000000007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for(int[][] a: dp){
            for(int[] b: a){
                Arrays.fill(b, -1);
            }
        }
        return helper(m,n,maxMove, startRow, startColumn, dp);

    }
    public int helper(int m, int n, int maxMove, int startRow, int startColumn,int[][][] dp){
        if((startRow==m || startColumn==n || startColumn<0 || startRow<0)){
            return 1;
        }
        if(maxMove<=0){
            return 0;
        }
        if(dp[startRow][startColumn][maxMove]!=-1){
            return dp[startRow][startColumn][maxMove];
        }
        int ans = 0;
        ans=(ans+helper(m,n,maxMove-1, startRow+1, startColumn, dp)%mod)%mod;
        ans=(ans+helper(m,n,maxMove-1, startRow-1, startColumn, dp)%mod)%mod;
        ans=(ans+helper(m,n,maxMove-1, startRow, startColumn+1,dp)%mod)%mod;
        ans=(ans+helper(m,n,maxMove-1, startRow, startColumn-1,dp)%mod)%mod;
        return dp[startRow][startColumn][maxMove]=ans;


    }
}