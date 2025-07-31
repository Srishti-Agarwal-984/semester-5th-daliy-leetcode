// Last updated: 7/31/2025, 5:35:35 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean p=false;
        int  m=matrix.length, n= matrix[0].length;
        int i=0, j=n-1;
        while(j>=0 && i<m){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j=j-1;
            }
            else{
                i=i+1;
            }
        }
        return false;
        
    }
}