// Last updated: 11/6/2025, 5:48:57 AM
class Solution {

    public int cherryPickup(int[][] grid) {
        int[][][] dp = new int[grid.length][grid[0].length][grid[0].length];
        for(int[][] ab: dp){
            for(int[] a: ab){
                Arrays.fill(a, -1);
            }
        }
        
        return helper(grid,0, 0,grid[0].length-1,dp);
        

    }
    public int helper(int[][] grid, int row, int c1, int c2, int[][][] dp){
        if(c1>=grid[0].length || c1<0 || c2<0 || c2>=grid[0].length){
            return 0;
        }
        if(row==grid.length-1){
            if(c1==c2){
                return grid[row][c1];
            }
            return grid[row][c1]+grid[row][c2];
        }
        if(dp[row][c1][c2]!=-1){
            return dp[row][c1][c2];

        }


        int[][] arr = {{-1,0},{0,0}, {1,0},{-1, -1},{0, -1}, {1, -1},{-1,1},{0,1}, {1,1}};
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            int r = helper(grid, row+1, c1+arr[i][0], c2+arr[i][1], dp)+grid[row][c1];
            if(c1!=c2){
                r+=grid[row][c2];

            }
            ans = Math.max(ans, r);

        }
        return dp[row][c1][c2]=ans;
    }
}