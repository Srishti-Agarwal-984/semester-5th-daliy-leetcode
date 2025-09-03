// Last updated: 9/4/2025, 4:42:52 AM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0], nums[1]);
        for(int i=2; i<nums.length-1; i++){
            int p=dp[i-2]+nums[i];
            int q = dp[i-1];
            dp[i]=Math.max(p,q);
        }
        int[] ro1 = new int[nums.length];
        ro1[1]=nums[1];
        for(int i=2; i<nums.length; i++){
            int a = nums[i]+ro1[i-2];
            int b = ro1[i-1];
            ro1[i]=Math.max(a,b);   
        }
        return Math.max(dp[dp.length-2], ro1[ro1.length-1]);

    }
}
