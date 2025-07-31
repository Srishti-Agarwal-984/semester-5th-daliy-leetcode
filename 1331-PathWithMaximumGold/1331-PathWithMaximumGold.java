// Last updated: 7/31/2025, 5:31:38 PM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]!=0){
                    boolean[][] g = new boolean[grid.length][grid[i].length];
                    ans=Math.max(ans, fpath(grid, g,i, j));

                }
            }
        }
        return ans;
        
    }
    public static int fpath(int[][] grid,boolean[][] g, int row, int col ){
        if(row<0 || row>=g.length || col<0 || col>=g[row].length || g[row][col]|| grid[row][col]==0){
            return 0;
        }
        g[row][col]=true;
        int md  = fpath(grid, g,row+1,col)+grid[row][col];
        int mu  = fpath(grid, g,row-1,col)+grid[row][col];
        int ml  = fpath(grid, g,row,col-1)+grid[row][col];
        int mr  = fpath(grid, g,row,col+1)+grid[row][col];
        g[row][col]=false;
        return Math.max(md, Math.max(ml,Math.max(mr,mu)));
    }
}