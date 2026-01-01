// Last updated: 1/1/2026, 9:01:13 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans = new int[nums.length*2];
4        int n = nums.length;
5        for(int i=0; i<nums.length; i++){
6            ans[i]=nums[i];
7            ans[i+n]=ans[i];
8
9        }
10        return ans;
11        
12    }
13}