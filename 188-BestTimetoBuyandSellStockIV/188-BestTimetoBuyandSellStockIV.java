// Last updated: 8/10/2025, 12:04:59 AM
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int i = n-1; i>=0; i--){
            for(int buy = 0; buy<=1; buy++){
                for(int cap = 1; cap<=k; cap++){
                    int profit = 0;
                    if(buy == 1){
                        int take = -prices[i]+dp[i+1][0][cap];
                        int notake = dp[i+1][1][cap];
                        profit = Math.max(take,notake);
                    }
                    else{
                        int take = prices[i]+dp[i+1][1][cap-1];
                        int notake = dp[i+1][0][cap];
                        profit = Math.max(take,notake);
                    }
                    dp[i][buy][cap] = profit;
                }
            }
        }
        return dp[0][1][k];
    }
}