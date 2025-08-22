// Last updated: 8/22/2025, 7:39:46 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int sr=-1, er=-1;
        int sc=-1, ec=-1;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    if((sc!=-1 && sc>i) || sc==-1){
                        sc=i;
                    }
                    if((sr!=-1 && sr>j) || sr==-1){
                        sr=j;
                    }
                    if(ec<i){
                        ec=i;
                    }
                    if(er<j){
                        er=j;
                    }
                }
            }
        }
       
        int area = (er-sr+1)*(ec-sc+1);
        return area;


    }
}