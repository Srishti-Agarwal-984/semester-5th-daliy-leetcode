// Last updated: 7/31/2025, 5:33:32 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double w=0.0, m=-1234789.00;
        int i=0, n=0, l=0;
        while(i<nums.length){
            w=w+nums[i];
            if(i-n+1==k){
                if(w>m){
                    m=w;    
                }
                w=w-nums[n++];
            }
            i=i+1;
        }
        return m/k;
        
    }
}