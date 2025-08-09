// Last updated: 8/10/2025, 12:02:58 AM
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][]dp = new int[n+1][2];
        for(int[] a : dp){
             
                Arrays.fill(a,-1);
            
        }
        return helper(0,1,n,prices,dp,fee);
    }
    public int helper(int i, int buy, int n, int[] prices, int[][] dp, int fee){
        if(i >= n){
            return 0;
        }
        if(dp[i][buy] != -1){
            return dp[i][buy];
        }
        int profit = 0;
        if(buy == 1){
            int take = -prices[i]+helper(i+1,0,n,prices,dp,fee);
            int notake = helper(i+1,1,n,prices,dp,fee);
            profit = Math.max(take,notake);
        }
        else{
            int sell = prices[i]+helper(i+1,1,n,prices,dp,fee)-fee;
            int nosell = helper(i+1,0,n,prices,dp,fee);
            profit = Math.max(sell,nosell);
        }
        return dp[i][buy] = profit;
    }
}