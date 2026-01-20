// Last updated: 1/20/2026, 12:39:31 PM
1class Solution {
2    public int maximumLength(String s) {
3        TreeMap<Integer, Integer>[] freq = new TreeMap[26];
4        int prev = s.charAt(0) - 'a';
5        int a = 1;
6        int ans = 0;
7
8        for (int i = 0; i < 26; i++) {
9            freq[i] = new TreeMap<>();
10        }
11
12        for (int i = 1; i < s.length(); i++) {
13            if (s.charAt(i) - 'a' == prev) {
14                a++;
15            } else {
16                for(int j=1; j<=a; j++){
17                    freq[prev].put(j, freq[prev].getOrDefault(j, 0) + a-j+1);
18                }
19                
20                a = 1;
21                prev = s.charAt(i) - 'a';
22            }
23        }
24        freq[prev].put(a, freq[prev].getOrDefault(a, 0) + 1);
25
26        for (int i = 0; i < 26; i++) {
27            if (freq[i].size() > 0) {
28                for (int j : freq[i].keySet()) {
29
30                    // Case 1: same length 3 baar aayi
31                    if (freq[i].get(j) >= 3) {
32                        ans = Math.max(ans, j);
33                    }
34
35                    // Case 2: ek long group se overlapping
36                    if (j >= 3) {
37                        ans = Math.max(ans, j - 2);
38                    }
39                }
40            }
41        }
42
43        return ans == 0 ? -1 : ans;
44    }
45}
46