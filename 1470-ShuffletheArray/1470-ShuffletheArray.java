// Last updated: 1/1/2026, 9:05:04 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans = new int[n*2];
4        int c=0;
5        for(int i=0; i<nums.length-n; i++){
6            ans[c]=nums[i];
7            ans[c+1]=nums[i+n];
8            c+=2;
9
10        }
11        return ans;
12        
13    }
14}