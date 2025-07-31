// Last updated: 7/31/2025, 5:25:44 PM
class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        long[][] dp = new long[k + 1][n];

        for (int t = 1; t <= k; t++) {
            long maxNormal = -prices[0];
            long maxShort = prices[0];

            for (int i = 1; i < n; i++) {
                dp[t][i] = Math.max(dp[t][i - 1],
                        Math.max(prices[i] + maxNormal, -prices[i] + maxShort));

                maxNormal = Math.max(maxNormal, dp[t - 1][i - 1] - prices[i]);
                maxShort = Math.max(maxShort, dp[t - 1][i - 1] + prices[i]);
            }
        }

        return dp[k][n - 1];
    }
}
