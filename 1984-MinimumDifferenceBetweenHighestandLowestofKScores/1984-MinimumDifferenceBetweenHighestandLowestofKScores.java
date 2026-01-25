// Last updated: 1/25/2026, 11:35:46 PM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int sum =nums[k-1]-nums[0];
5        
6        int n= nums.length;
7        for(int i=0; i<=n-k; i++){
8            sum = Math.min(nums[i+k-1]-nums[i], sum);
9        }
10        return sum;
11        
12        
13    }
14}