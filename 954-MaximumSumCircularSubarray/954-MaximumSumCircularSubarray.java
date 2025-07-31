// Last updated: 7/31/2025, 5:32:38 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int ans;
        int f=0, l=0;
        int c=0, m=Integer.MIN_VALUE; 

        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            f=f+nums[i];
            l=l+nums[i];
            if(f>0){
                f=0;
            }
            minsum=Math.min(minsum, Math.min(f, nums[i]));
            if(l<0){
                l=0;
                c++;
            }
            m=Math.max(m, nums[i]);
            maxsum=Math.max(maxsum, Math.max(l, nums[i]));
        }
        if(c==nums.length){
            return m;
        }
        ans=Math.max(sum, Math.max(sum-minsum, maxsum));
        return ans;
    }
}
