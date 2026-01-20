// Last updated: 1/20/2026, 12:41:18 PM
1class Solution {
2    public int maximumLength(String s) {
3        HashMap<Integer, Integer>[] freq = new HashMap[26];
4        int prev = s.charAt(0) - 'a';
5        int a = 1;
6        int ans = 0;
7        for (int i = 0; i < 26; i++) {
8            freq[i] = new HashMap<>();
9        }
10        for (int i = 1; i < s.length(); i++) {
11            if (s.charAt(i) - 'a' == prev) {
12                a++;
13            } else {
14                for(int j=1; j<=a; j++){
15                    freq[prev].put(j, freq[prev].getOrDefault(j, 0) + a-j+1);
16                }
17                
18                a = 1;
19                prev = s.charAt(i) - 'a';
20            }
21        }
22        freq[prev].put(a, freq[prev].getOrDefault(a, 0) + 1);
23
24        for (int i = 0; i < 26; i++) {
25            if (freq[i].size() > 0) {
26                for (int j : freq[i].keySet()) {
27
28                    // Case 1: same length 3 baar aayi
29                    if (freq[i].get(j) >= 3) {
30                        ans = Math.max(ans, j);
31                    }
32
33                    // Case 2: ek long group se overlapping
34                    if (j >= 3) {
35                        ans = Math.max(ans, j - 2);
36                    }
37                }
38            }
39        }
40
41        return ans == 0 ? -1 : ans;
42    }
43}
44