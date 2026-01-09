// Last updated: 1/9/2026, 12:42:25 PM
1class Solution {
2    public boolean differByOneChar(String word1, String word2) {
3        if (word1.length() != word2.length()) return false;
4        int diffCount = 0;
5        for (int i = 0; i < word1.length(); i++)
6            if (word1.charAt(i) != word2.charAt(i))
7                diffCount++;
8        return diffCount == 1;
9    }
10
11    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
12        int n = groups.length;
13        int[] dp = new int[n];
14        int[] parent = new int[n];
15        Arrays.fill(dp, 1);
16        Arrays.fill(parent, -1);
17        int maxi = 0;
18
19        for (int i = 0; i < n; i++) {
20            for (int j = 0; j < i; j++) {
21                if (groups[i] != groups[j] &&
22                    differByOneChar(words[i], words[j]) &&
23                    dp[i] < dp[j] + 1) {
24                    dp[i] = dp[j] + 1;
25                    parent[i] = j;
26                }
27            }
28            if (dp[i] > maxi) maxi = dp[i];
29        }
30
31        List<String> result = new ArrayList<>();
32        for (int i = 0; i < n; i++) {
33            if (dp[i] == maxi) {
34                while (i != -1) {
35                    result.add(words[i]);
36                    i = parent[i];
37                }
38                break;
39            }
40        }
41        Collections.reverse(result);
42        return result;
43    }
44}