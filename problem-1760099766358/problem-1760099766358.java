// Last updated: 10/10/2025, 6:06:06 PM
class Solution {
    public int longestIncreasingPath(int[][] grid) {
        int ans = 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                int d = helper(grid[i][j], grid,i-1,j,dp);
                int r= helper(grid[i][j], grid,i,j+1,dp);
                int u = helper(grid[i][j], grid,i+1,j,dp);
                int l = helper(grid[i][j], grid,i,j-1,dp);
                int an = Math.max(r,Math.max(l,Math.max(u,d)))+1;
                ans= Math.max(ans, an);
            }

        }
        return  ans;
    }
    public int helper(int prev, int[][] grid, int row, int col,int[][] dp){
        if( row<0 || col<0|| row>=grid.length || col>=grid[0].length){
            return 0;
        }
        if(grid[row][col]<=prev){
            return 0;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        int u = helper(grid[row][col], grid,row+1,col,dp);
        int d = helper(grid[row][col], grid,row-1,col,dp);
        int r= helper(grid[row][col], grid,row,col+1,dp);
        int l = helper(grid[row][col], grid,row,col-1,dp);
        int an = Math.max(r,Math.max(l,Math.max(u,d)))+1;
        return dp[row][col]=an;
    }
}
        