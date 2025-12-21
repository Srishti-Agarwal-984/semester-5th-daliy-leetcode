// Last updated: 12/21/2025, 9:24:33 PM
1class Solution {
2    HashMap<String, Boolean> memo = new HashMap<>();
3
4    public boolean isScramble(String s1, String s2) {
5        if (s1.length() != s2.length()) return false;
6        return dfs(s1, s2);
7    }
8
9    private boolean dfs(String s1, String s2) {
10        if (s1.equals(s2)) return true;
11
12        String key = s1 + "#" + s2;
13        if (memo.containsKey(key)) {
14            return memo.get(key);
15        }
16
17        // Character frequency pruning
18        int[] freq = new int[26];
19        for (int i = 0; i < s1.length(); i++) {
20            freq[s1.charAt(i) - 'a']++;
21            freq[s2.charAt(i) - 'a']--;
22        }
23        for (int f : freq) {
24            if (f != 0) {
25                memo.put(key, false);
26                return false;
27            }
28        }
29
30        int n = s1.length();
31        for (int i = 1; i < n; i++) {
32            // Case 1: no swap
33            if (dfs(s1.substring(0, i), s2.substring(0, i)) &&
34                dfs(s1.substring(i), s2.substring(i))) {
35                memo.put(key, true);
36                return true;
37            }
38
39            // Case 2: swap
40            if (dfs(s1.substring(0, i), s2.substring(n - i)) &&
41                dfs(s1.substring(i), s2.substring(0, n - i))) {
42                memo.put(key, true);
43                return true;
44            }
45        }
46
47        memo.put(key, false);
48        return false;
49    }
50}
51