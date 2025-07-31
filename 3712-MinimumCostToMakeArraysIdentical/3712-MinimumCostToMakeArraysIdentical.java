// Last updated: 7/31/2025, 5:26:28 PM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==brr[i]){
                continue;
            }
            int kl = arr[i]-brr[i];
            if(kl<0){
                kl*=-1;
                
            }
            sum=sum+kl;
        }
        if(sum<=k || arr.length==1){
            return sum;
        }
        long sum1 = k;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==brr[i]){
                continue;
            }
            int kl = arr[i]-brr[i];
            if(kl<0){
                kl*=-1;
                
            }
            sum1=sum1+kl;
        }
        if(sum1>sum){
            return sum;
        }
        return sum1;
        
        
        
        
        
    }
}