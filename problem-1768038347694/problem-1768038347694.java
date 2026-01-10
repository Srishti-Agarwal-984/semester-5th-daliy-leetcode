// Last updated: 1/10/2026, 3:15:47 PM
1class Solution {
2    public int longestArithSeqLength(int[] nums) {
3        int n = nums.length;
4        int[][] dp = new int[n][1001];
5        int res = 0;
6        for(int i = 1; i<n; i++){
7            for(int j = 0; j<i; j++){
8                int diff = nums[i]-nums[j]+500;
9                dp[i][diff] = (dp[j][diff] > 0) ? dp[j][diff]+1 : 2;
10                res = Math.max(res,dp[i][diff]); 
11            }
12        }
13        return res;
14    }
15}