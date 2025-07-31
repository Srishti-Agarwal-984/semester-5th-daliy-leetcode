// Last updated: 7/31/2025, 5:31:18 PM
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length];
        int[] ans = new int[queries.length];
        int an =0;
        for(int i=0; i<arr.length; i++){
            an=an^arr[i];
            xor[i]=an;
        }
        for(int i=0; i<queries.length; i++){
            int l1=queries[i][0], l2 = queries[i][1];
            if(l1==0){
                ans[i]=xor[l2];
            }
            else{
                ans[i]=xor[l2]^xor[l1-1];
            }
        }
        return ans;



    }
}