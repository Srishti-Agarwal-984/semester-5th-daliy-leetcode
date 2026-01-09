// Last updated: 1/9/2026, 1:01:22 PM
1class Solution {
2
3    List<String>[][] dp;
4
5    public boolean differByOneChar(String word1, String word2) {
6        if (word1.length() != word2.length()) return false;
7        int diff = 0;
8        for (int i = 0; i < word1.length(); i++) {
9            if (word1.charAt(i) != word2.charAt(i)) diff++;
10            if (diff > 1) return false;
11        }
12        return diff == 1;
13    }
14
15    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
16        int n = words.length;
17        dp = new ArrayList[n][n + 1]; // prev = -1 mapped to 0
18        return helper(words, groups, 0, -1);
19    }
20
21    private List<String> helper(String[] words, int[] groups, int i, int prev) {
22        if (i == words.length) {
23            return new ArrayList<>();
24        }
25
26        if (dp[i][prev + 1] != null) {
27            return dp[i][prev + 1];
28        }
29
30        // Option 1: skip
31        List<String> skip = helper(words, groups, i + 1, prev);
32
33        // Option 2: take
34        List<String> take = new ArrayList<>();
35        if (prev == -1 ||
36            (groups[i] != groups[prev] &&
37             differByOneChar(words[i], words[prev]))) {
38
39            take = helper(words, groups, i + 1, i);
40            take = new ArrayList<>(take);
41            take.add(0, words[i]);
42        }
43
44        // store best
45        if (take.size() > skip.size()) {
46            dp[i][prev + 1] = take;
47        } else {
48            dp[i][prev + 1] = skip;
49        }
50
51        return dp[i][prev + 1];
52    }
53}
54