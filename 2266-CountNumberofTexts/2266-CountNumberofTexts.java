// Last updated: 1/28/2026, 11:46:17 AM
1class Solution {
2    int mod = 1000000007;
3
4    public int countTexts(String pressedKeys) {
5        int[] dp = new int[pressedKeys.length()];
6        Arrays.fill(dp, -1);
7        return helper(pressedKeys, 0, dp);
8    }
9
10    public int helper(String s, int i, int[] dp) {
11        if (i >= s.length()) return 1;
12        if (dp[i] != -1) return dp[i];
13
14        int ans = 0;
15        char ch = s.charAt(i);
16        int maxLen = (ch == '7' || ch == '9') ? 4 : 3;
17
18        for (int j = i; j < s.length() && j < i + maxLen; j++) {
19            if (s.charAt(j) != ch) break;
20            ans = (ans + helper(s, j + 1, dp)) % mod;
21        }
22
23        return dp[i] = ans;
24    }
25}
26