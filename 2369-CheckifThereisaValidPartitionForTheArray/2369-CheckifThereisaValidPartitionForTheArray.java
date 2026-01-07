// Last updated: 1/7/2026, 8:08:45 AM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int[] dp = new int[nums.length+1];
4        return helper(dp, nums, 0);
5        
6    }
7    public boolean helper(int[] dp, int[] nums, int si){
8        if(si>=nums.length){
9            return true;
10        }
11        if(dp[si]!=0){
12            return dp[si]>0;
13        }
14        boolean ans=false;
15        if(nums.length-si>=2){
16            if(nums[si]==nums[si+1]){
17                ans=ans|helper(dp, nums, si+2);
18            }
19            if(nums.length-si>=3 && nums[si]==nums[si+1] && nums[si]==nums[si+2]){
20                ans=ans|helper(dp, nums, si+3);
21            }
22            if(nums.length-si>=3 && nums[si+1]-nums[si]==1 && nums[si+2]-nums[si+1]==1){
23                ans=ans|helper(dp, nums, si+3);
24            }
25        }
26        dp[si]=ans?1:-1;
27        return ans;
28    }
29}