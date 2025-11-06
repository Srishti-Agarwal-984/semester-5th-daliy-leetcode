// Last updated: 11/6/2025, 6:07:56 AM
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k * k <= i; k++) {
                // If by taking k*k we force opponent into losing state, we win
                if (dp[i - k * k] == false) {
                    dp[i] = true;
                    break; // No need to check further
                }
            }
        }
        return dp[n];
    }
}