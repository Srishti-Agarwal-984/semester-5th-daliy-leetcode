// Last updated: 7/31/2025, 5:26:31 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int c=0;
        ArrayList<Integer> as = new ArrayList<Integer>();
        for(int i=0; i<grid.length; i++){
            if(c%2==0){
                for(int j=0; j<grid[i].length; j=j+2){
                    as.add(grid[i][j]);
                }
                c++;
            }
            else{
                int j=grid[i].length-2;
                if(grid[i].length%2==0){
                    j=grid[i].length-1;
                }
                for(int gj=j; gj>=0; gj=gj-2){
                    as.add(grid[i][gj]);
                }
                c++;
            }
        }
        return as;
        
    }
}