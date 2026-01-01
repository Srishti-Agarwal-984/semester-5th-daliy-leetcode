// Last updated: 1/1/2026, 9:07:32 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3       int max = nums[0];
4        for(int i=1; i<nums.length; i++){
5            if(nums[i]!=0){
6                nums[i]+=nums[i-1];
7                max = Math.max(max, nums[i]);
8            }
9        }
10        return max;
11        
12    }
13}