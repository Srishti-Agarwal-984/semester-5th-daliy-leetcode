// Last updated: 10/7/2025, 12:37:39 AM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        int[][] dp = new int[nums.length][sum+1];
        return helper(sum,0,nums,dp);
    }
    public boolean helper(int sum,int i,int[] nums,int[][] dp){
        if(sum==0){
            return true;
        }
        if(i>=nums.length){
            return false;
        }
        if(dp[i][sum]!=0){
            return dp[i][sum]==1;
        }
        boolean inc=false,exc=false;
        if(sum>=nums[i]){
            inc=helper(sum-nums[i],i+1,nums,dp);
        }
        exc=helper(sum,i+1,nums,dp);
        dp[i][sum]=inc || exc?1:-1;
        return inc || exc;
    }
}
