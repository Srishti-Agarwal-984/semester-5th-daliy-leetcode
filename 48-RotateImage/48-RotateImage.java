// Last updated: 7/31/2025, 5:38:04 PM
class Solution {
    public void rotate(int[][] matrix) {
        int [][] ar = new int[matrix.length][matrix.length];
        int i=0, j=0;
        for(int col = 0; col<matrix.length; col++){
            j=0;
            for(int row =matrix.length-1; row>=0; row--){
                ar[i][j]=matrix[row][col];
                j++;
            }
            i++;
        }
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix.length; j++){
                matrix[i][j]=ar[i][j];
            }
        }
        
    }
}