// Last updated: 11/29/2025, 7:15:27 AM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        long hj =0;
4        for(int i=0; i<nums.length; i++){
5            hj+=nums[i];
6        }
7        hj=hj%k;
8        return (int)(hj);
9        
10    }
11}