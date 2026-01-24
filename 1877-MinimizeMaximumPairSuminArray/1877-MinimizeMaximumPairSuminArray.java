// Last updated: 1/24/2026, 9:21:09 PM
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int si=0, en=nums.length-1;
5        int ans = 0;
6        while(si<=en){
7            ans = Math.max(nums[si]+nums[en], ans);
8            si++;
9            en--;
10        }
11        return ans;
12    }
13}