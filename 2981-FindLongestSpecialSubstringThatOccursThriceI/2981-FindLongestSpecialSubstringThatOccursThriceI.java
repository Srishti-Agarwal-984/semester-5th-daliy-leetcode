// Last updated: 1/10/2026, 8:16:37 PM
1class Solution {
2    public int maximumLength(String s) {
3        int n = s.length();
4        Map<String, Integer> map = new HashMap<>();
5
6        for (int i = 0; i < n; ) {
7            int j = i;
8            char ch = s.charAt(i);
9
10            // find continuous block
11            while (j < n && s.charAt(j) == ch) j++;
12
13            int len = j - i;
14
15            // generate only special substrings
16            for (int l = 1; l <= len; l++) {
17                String sub = s.substring(i, i + l);
18                map.put(sub, map.getOrDefault(sub, 0) + (len - l + 1));
19            }
20
21            i = j; // IMPORTANT
22        }
23
24        int ans = 0;
25        for (String key : map.keySet()) {
26            if (map.get(key) >= 3) {
27                ans = Math.max(ans, key.length());
28            }
29        }
30        return ans == 0 ? -1 : ans;
31    }
32}
33