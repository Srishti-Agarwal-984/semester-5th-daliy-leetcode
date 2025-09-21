// Last updated: 9/21/2025, 6:34:56 AM
class Solution {
    public int jump(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp, 100000);
        return helper(dp, nums, 0);
    }
    public int helper(int[] dp, int[] nums, int i){
        if(i>=nums.length-1){
            return 0;
        }
        if(dp[i]!=100000){
            return dp[i];
        }
        int p=nums[i];
        int ans=100000;
        for(int si=i+1; si<=Math.min(i+p, nums.length-1); si++){
            int u = helper(dp, nums, si)+1;
            ans=Math.min(ans, u);
        }
        return dp[i]=ans;
    }
}