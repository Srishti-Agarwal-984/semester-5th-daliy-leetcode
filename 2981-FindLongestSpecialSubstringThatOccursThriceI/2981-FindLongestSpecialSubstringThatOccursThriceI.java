// Last updated: 1/10/2026, 8:09:00 PM
1class Solution {
2    public int maximumLength(String s) {
3        int n = s.length();
4        int[][] cnt = new int[26][n + 1];
5
6        // Step 1: count continuous blocks
7        for (int i = 0; i < n; ) {
8            char ch = s.charAt(i);
9            int j = i;
10            while (j < n && s.charAt(j) == ch) j++;
11            int len = j - i;
12
13            // all possible substring lengths from this block
14            for (int l = 1; l <= len; l++) {
15                cnt[ch - 'a'][l] += (len - l + 1);
16            }
17            i = j;
18        }
19
20        // Step 2: find max length appearing >= 3 times
21        for (int l = n; l >= 1; l--) {
22            for (int c = 0; c < 26; c++) {
23                if (cnt[c][l] >= 3) {
24                    return l;
25                }
26            }
27        }
28        return -1;
29    }
30}
31