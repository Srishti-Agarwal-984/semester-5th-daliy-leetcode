// Last updated: 7/31/2025, 5:31:16 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        long sum=0;
        int cn=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];

        }
        if(sum/k>=threshold){
            cn++;
        }
        for(int i=k; i<arr.length; i++){
            sum+=arr[i]-arr[i-k];
            if(sum/k>=threshold){
                cn++;
            }
        }
        return cn;
    }
}