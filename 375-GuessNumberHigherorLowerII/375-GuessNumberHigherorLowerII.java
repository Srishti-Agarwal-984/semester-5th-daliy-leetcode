// Last updated: 12/1/2025, 11:00:47 PM
1class Solution {
2    public int getMoneyAmount(int n) {
3        int[][] dp = new int[n+1][n+1];
4        for(int[] p:dp){
5            Arrays.fill(p, -1);
6        }
7        return helper(1, n, dp);
8        
9    }
10    public int helper(int si, int en, int[][] dp){
11        if(si==en){
12            return 0;
13        }
14        if(si>en){
15            return -1000000000;
16
17        }
18        if(dp[si][en]!=-1){
19            return dp[si][en];
20        }
21        int ans=1000000000;
22        for(int i=si; i<=en; i++){
23            int h = helper(i+1, en, dp);
24            int l=helper(si, i-1, dp);
25            ans=Math.min(ans, i+Math.max(h,l));
26        }
27        return dp[si][en]=ans;
28    }
29}