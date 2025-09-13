// Last updated: 9/13/2025, 6:05:20 AM
class Solution {
    int ed = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        int ans = helper(grid, 0,0, dp);
        return ans;
    }
    public int  helper(int[][] grid, int r, int c, int[][] dp){
        if(r==grid.length-1 && c==grid[0].length-1){
            return dp[r][c]=grid[r][c];
            // System.out.println(sum);
        }
        if(r>=grid.length || c>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int down = helper(grid, r+1, c, dp);
        int right = helper(grid, r, c+1, dp);
        return dp[r][c]= Math.min(down,right)+grid[r][c];
    }
}