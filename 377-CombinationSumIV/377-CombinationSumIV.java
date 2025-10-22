// Last updated: 10/22/2025, 1:04:35 PM
class Solution {
    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp,-1);

       
        return combinationSum41(nums, target,dp);
        
    }
    public int combinationSum41(int[] nums, int target, int[] dp) {
        
        if(target==0){
            return 1;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=target){
                ans=ans+combinationSum41(nums, target-nums[i],dp);
            }
        }
        return dp[target]=ans;
        
    }
}