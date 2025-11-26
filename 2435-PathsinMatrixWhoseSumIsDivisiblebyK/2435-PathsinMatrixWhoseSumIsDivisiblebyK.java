// Last updated: 11/26/2025, 11:57:47 AM
class Solution {
    int mod = 1000000007;
    public int numberOfPaths(int[][] grid, int k) {
        long[][][] dp = new long[grid.length][grid[0].length][k+1];
        for(long[][] ap: dp){
            for(long[] p: ap){
                Arrays.fill(p, -1);
            }

        }
        return (int)(helper(grid, k, 0, 0, 0, dp));
        
    }
    public long helper(int[][] grid, int k, int i, int j, int sum,long[][][] dp){
        if(i==grid.length-1 && j==grid[0].length-1){
            return (sum+grid[i][j])%k==0? 1:0;
        }
        if(i==grid.length || j==grid[0].length){
            return 0;
        }
        if(dp[i][j][sum]!=-1){
            return dp[i][j][sum];
        }
        long a = helper(grid, k, i+1, j, (sum+grid[i][j])%k,dp)%mod;
        long b = helper(grid, k, i, j+1, (sum+grid[i][j])%k,dp)%mod;
        
        return dp[i][j][sum]=(a+b)%mod;
    }
}