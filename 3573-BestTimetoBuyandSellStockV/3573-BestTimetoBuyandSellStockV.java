// Last updated: 12/18/2025, 9:28:06 PM
1class Solution {
2    public long maximumProfit(int[] prices, int k) {
3        int n = prices.length;
4        if (n == 0 || k == 0) return 0;
5
6        long[][] dp = new long[k + 1][n];
7
8        for (int t = 1; t <= k; t++) {
9            long maxNormal = -prices[0];
10            long maxShort = prices[0];
11
12            for (int i = 1; i < n; i++) {
13                dp[t][i] = Math.max(dp[t][i - 1],
14                        Math.max(prices[i] + maxNormal, -prices[i] + maxShort));
15
16                maxNormal = Math.max(maxNormal, dp[t - 1][i - 1] - prices[i]);
17                maxShort = Math.max(maxShort, dp[t - 1][i - 1] + prices[i]);
18            }
19        }
20
21        return dp[k][n - 1];
22    }
23}
24