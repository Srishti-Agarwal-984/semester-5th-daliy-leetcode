// Last updated: 7/31/2025, 5:37:37 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int [] a= new int[matrix.length];
        int [] b = new int[matrix[0].length];
        int k=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    a[i]++;
                    b[j]++;
                }
            }
            k++;
        }
        for(int i=0; i<matrix.length; i++){
            if(a[i]>=1){
               for(int j=0; j<matrix[i].length; j++){
                    matrix[i][j]=0;
                }

            }
        }
        for(int i=0; i<matrix[0].length; i++){
            if(b[i]>=1){
               for(int j=0; j<matrix.length; j++){
                    matrix[j][i]=0;
                }

            }
        }


        
    }
}