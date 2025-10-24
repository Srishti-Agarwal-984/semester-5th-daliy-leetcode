// Last updated: 10/24/2025, 11:45:47 PM
class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int ans=Integer.MAX_VALUE;
        int[][] dp = new int[grid.length+1][grid.length*grid[0].length];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        for(int i=0; i<grid[0].length; i++){
            int w = helper(grid, moveCost,grid[0][i],1,dp)+grid[0][i];
            ans= Math.min(ans, w);
        }
        return ans;
    }
    public int helper(int[][] grid, int[][] moveCost, int i,int row,int[][] dp){
        if(row==grid.length){
            return 0;
        }
        if(dp[row][i]!=-1){
            return dp[row][i];
        }
        int ans=Integer.MAX_VALUE;
        for(int j=0; j<grid[row].length; j++){
            int w = helper(grid, moveCost,grid[row][j],row+1,dp)+moveCost[i][j]+grid[row][j];
            ans= Math.min(ans, w);
        }
        return dp[row][i]=ans;
    }
}