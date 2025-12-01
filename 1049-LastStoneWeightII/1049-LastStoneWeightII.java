// Last updated: 12/1/2025, 6:17:10 PM
1class Solution {
2    public int lastStoneWeightII(int[] stones) {
3        int n = stones.length;
4        int total = 0;
5        for(int el : stones){
6            total += el;
7        }
8        int[][] dp = new int[n][total+1];
9        for(int[] a : dp){
10            Arrays.fill(a,-1);
11        }
12        return helper(0,0,stones,total,dp);
13    }
14    public int helper(int idx, int sum, int[] arr, int total, int[][] dp){
15        if(idx >= arr.length){
16            int ans = total - sum;
17            return Math.abs(ans-sum);
18        }
19        if(dp[idx][sum] != -1){
20            return dp[idx][sum];
21        }
22
23        int take = helper(idx+1,sum+arr[idx],arr,total,dp);
24        int notake = helper(idx+1,sum,arr,total,dp);
25        return dp[idx][sum] = Math.min(take,notake);
26    }
27}
28