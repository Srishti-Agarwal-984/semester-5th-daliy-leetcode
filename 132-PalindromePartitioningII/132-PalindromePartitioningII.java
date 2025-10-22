// Last updated: 10/22/2025, 12:43:13 PM
class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] a : dp) Arrays.fill(a, -1);
        return helper(s, 0, n - 1, dp);
    }

    private int helper(String s, int si, int en, int[][] dp) {
        if (si >= en || isPalindrome(s, si, en)) return 0;
        if (dp[si][en] != -1) return dp[si][en];
        
        int minCuts = Integer.MAX_VALUE;
        for (int k = si; k < en; k++) {
            if (isPalindrome(s, si, k)) {
                int cuts = 1 + helper(s, k + 1, en, dp);
                minCuts = Math.min(minCuts, cuts);
            }
        }
        return dp[si][en] = minCuts;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
