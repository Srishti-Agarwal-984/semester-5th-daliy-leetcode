// Last updated: 7/31/2025, 5:28:01 PM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max =-1;
        int idx=-1;
        for(int i=0; i<mat.length; i++){
            int sum=0;
            for(int j=0; j<mat[i].length; j++){
                sum=sum+mat[i][j];
            }
            if(sum>max){
                max = sum;
                idx=i;
            }
        }
        int[] arr = new int[2];
        arr[0]=idx;
        arr[1]=max;
        return arr;
    }
}