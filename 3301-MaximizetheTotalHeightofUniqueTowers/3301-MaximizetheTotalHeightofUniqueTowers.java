// Last updated: 9/16/2025, 11:51:58 PM
class Solution {
    public long maximumTotalSum(int[] mH) {
        Arrays.sort(mH);
        int n = mH.length-1;
        long sum= mH[n];
        n=n-1;
        for(int i=n; i>=0; i--){
            if(mH[i]>=mH[i+1]){
                mH[i]=mH[i+1]-1;
            }
            sum=sum+mH[i];
            if(mH[i]<=0){
                return -1;
            }
        }
        return sum;
        
    }
}