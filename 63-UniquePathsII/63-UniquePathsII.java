// Last updated: 9/13/2025, 5:49:43 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length-1, m=obstacleGrid[0].length-1;
         if(obstacleGrid[n][m]==1){
            return 0;
        }
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        int a = helper(dp,obstacleGrid,0,0, n, m);
        return a;
    }
    public int helper(int[][] dp, int[][] obstacleGrid, int i, int j, int n, int m){
        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
            return 1;
        }
        if(i>=obstacleGrid.length || j>=obstacleGrid[0].length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int r=0, d=0;
        if(j<m && obstacleGrid[i][j+1]!=1){
            r=helper(dp,obstacleGrid,i,j+1, n, m);
        }
        if(i<n && obstacleGrid[i+1][j]!=1){
            d=helper(dp,obstacleGrid,i+1,j, n, m);
        }
        return dp[i][j]=d+r;

    }
}