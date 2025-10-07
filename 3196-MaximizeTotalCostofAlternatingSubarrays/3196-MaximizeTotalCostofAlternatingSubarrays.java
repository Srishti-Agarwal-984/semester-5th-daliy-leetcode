// Last updated: 10/7/2025, 12:41:39 PM
class Solution {
    public long maximumTotalCost(int[] nums) {
        long[][] dp= new long[nums.length][2];
        for(long[] p: dp){
            Arrays.fill(p, Long.MIN_VALUE);
        }
        long ans=nums[0];
        ans=ans+helper(nums,1,1,dp);
        return ans;
        
    }
    public long helper(int[] nums,int i,int flag,long[][] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][flag]!=Long.MIN_VALUE){
            return dp[i][flag];
        }
        long inc=0,exc=0;
        int a = flag%2!=0?-1:1;
        inc=inc+nums[i]*a+helper(nums,i+1,(flag+1)%2,dp);
        exc=nums[i]+helper(nums,i+1,flag,dp);
        return dp[i][flag]=Math.max(inc,exc);
    }
}