// Last updated: 9/3/2025, 1:41:32 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0; i<nums.length; i++){
            int c=0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    c=Math.max(c, dp[j]);
                }
            }
            dp[i]+=c;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}