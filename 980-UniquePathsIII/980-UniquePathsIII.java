// Last updated: 10/14/2025, 8:53:14 PM
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int ans=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    grid[i][j]=-1;
                    int a1 = helper(i+1,j, grid)+helper(i,j+1, grid)+helper(i-1,j,grid)+helper(i,j-1, grid);
                    ans=a1;
                    break;
                }
            }
        }
        return ans;
    }
    public int helper(int row, int col,  int[][] grid){
        if(row>=grid.length || col>=grid[0].length || col<0 || row<0 || grid[row][col]==-1){
            return 0;
        }
        if(grid[row][col]==2 && checker(grid)){
            return 1;
        }
        if(grid[row][col]==2 && !checker(grid)){
            return 0;
        }
  
        grid[row][col]=-1;
        int a1 = helper(row+1,col,grid)+helper(row,col+1, grid)+helper(row-1,col, grid)+helper(row,col-1,grid);
        grid[row][col]=0;
        return a1;


    }
    public boolean checker(int[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==0){
                    return false;
                    
                }
            }
        }
        return true;
    }
}