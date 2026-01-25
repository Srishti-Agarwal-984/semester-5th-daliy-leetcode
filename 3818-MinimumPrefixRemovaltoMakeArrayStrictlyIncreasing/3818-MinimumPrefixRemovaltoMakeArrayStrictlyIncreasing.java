// Last updated: 1/25/2026, 11:28:49 PM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int prev = nums[nums.length-1];
4        for(int i=nums.length-2; i>=0; i--){
5            if(prev<=nums[i]){
6                return i+1;
7
8            }
9            prev = nums[i];
10        }
11        return 0;
12        
13    }
14}