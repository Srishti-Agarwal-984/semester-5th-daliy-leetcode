// Last updated: 10/10/2025, 5:57:21 PM
class Solution {
    int mod= 1000000007;
    public int countPaths(int[][] grid) {
        long ans = 0;
        long[][] dp = new long[grid.length][grid[0].length];
        for(long[] a: dp){
            Arrays.fill(a, -1);
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                long u = helper(grid[i][j], grid,i+1,j,dp)%mod;
                long d = helper(grid[i][j], grid,i-1,j,dp)%mod;
                long r= helper(grid[i][j], grid,i,j+1,dp)%mod;
                long l = helper(grid[i][j], grid,i,j-1,dp)%mod;
                long an = ((((u+d)%mod+r)%mod+l)%mod+1)%mod;
                ans= (ans%mod+ an%mod)%mod;
            }

        }
        return (int) ans;
    }
    public long helper(int prev, int[][] grid, int row, int col,long[][] dp){
        if( row<0 || col<0|| row>=grid.length || col>=grid[0].length){
            return 0l;
        }
        if(grid[row][col]<=prev){
            return 0l;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        long u = helper(grid[row][col], grid,row+1,col,dp)%mod;
        long d = helper(grid[row][col], grid,row-1,col,dp)%mod;
        long r= helper(grid[row][col], grid,row,col+1,dp)%mod;
        long l = helper(grid[row][col], grid,row,col-1,dp)%mod;
        long ans = ((((u+d)%mod+r)%mod+l)%mod+1)%mod;
        return dp[row][col]=ans;
    }
}
        