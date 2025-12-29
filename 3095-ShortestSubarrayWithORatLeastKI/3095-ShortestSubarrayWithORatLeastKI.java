// Last updated: 12/29/2025, 7:48:43 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        
4        int ans = Integer.MAX_VALUE;
5        for(int i=0; i<nums.length; i++){
6            int sum=0;
7            for(int j=i; j<nums.length; j++){
8                sum = sum|nums[j];
9                if(sum>=k){
10                    ans= Math.min(ans, j-i+1);
11                    break;
12                }
13
14            }
15        }
16        return ans==Integer.MAX_VALUE?-1: ans;
17        
18    }
19}