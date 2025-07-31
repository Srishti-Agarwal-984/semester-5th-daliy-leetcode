# Last updated: 7/31/2025, 5:25:48 PM
class Solution(object):
    def maximumProfit(self, prices, k):
        """
        :type prices: List[int]
        :type k: int
        :rtype: int
        """
        n = len(prices)
        if n == 0 or k == 0:
            return 0

        # dp[t][i] = max profit using at most t transactions up to day i
        dp = [[0] * n for _ in range(k + 1)]

        for t in range(1, k + 1):
            max_normal = -prices[0]   # Best buy value so far for normal transaction
            max_short = prices[0]     # Best sell value so far for short transaction

            for i in range(1, n):
                # max of: do nothing, sell today (normal), buy back today (short)
                dp[t][i] = max(
                    dp[t][i - 1],                   # No transaction ends today
                    prices[i] + max_normal,         # Sell today (normal)
                    -prices[i] + max_short          # Buy back today (short selling)
                )

                # Update max_normal: best (prev dp - price) so far
                max_normal = max(max_normal, dp[t - 1][i - 1] - prices[i])
                # Update max_short: best (prev dp + price) so far
                max_short = max(max_short, dp[t - 1][i - 1] + prices[i])

        return dp[k][n - 1]
