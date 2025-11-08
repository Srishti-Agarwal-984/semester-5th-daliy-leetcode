// Last updated: 11/8/2025, 1:20:40 PM
class Solution {
    public int minArraySum(int[] nums, int k, int opt1, int opt2) {
        int[][][] dp = new int[nums.length][opt1+1][opt2+1];
        for(int[][] l:  dp){
            for(int[] k1: l){
                Arrays.fill(k1, -1);
            }
        }
        int sum=helper(nums, k, opt1, opt2, 0, dp);
        return sum;
    }
    public int helper(int[] nums, int k, int opt1, int opt2, int i, int[][][] dp){
        if(i>= nums.length){
            return 0;
        }
        if(dp[i][opt1][opt2]!=-1){
            return dp[i][opt1][opt2];
        }
        int r = nums[i]+helper(nums, k, opt1, opt2, i+1, dp);
        if(opt1>0 && opt2>0){
            if((nums[i]+1)/2>=k){
                r=Math.min(r, helper(nums, k, opt1-1, opt2-1, i+1, dp)+((nums[i]+1)/2)-k);
            }
            if(nums[i]>=k){
                r=Math.min(r, helper(nums, k, opt1-1, opt2-1, i+1, dp)+(nums[i]-k+1)/2);
            }
        }
        if(opt1>0){
            r=Math.min(r, helper(nums, k, opt1-1, opt2, i+1, dp)+(nums[i]+1)/2);
        }
        if(opt2>0 && nums[i]>=k){
            r=Math.min(r, helper(nums, k, opt1, opt2-1, i+1, dp)+(nums[i]-k));
        }
        return dp[i][opt1][opt2]=r;
        
        

    }
}