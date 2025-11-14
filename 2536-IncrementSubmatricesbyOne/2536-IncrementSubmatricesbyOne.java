// Last updated: 11/14/2025, 7:59:24 AM
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] arr = new int[n][n];
        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][2]; j++){
                for(int k=queries[i][1]; k<=queries[i][3]; k++){
                    arr[j][k]+=1;
                }
            }
        }
        return arr;
    }
}