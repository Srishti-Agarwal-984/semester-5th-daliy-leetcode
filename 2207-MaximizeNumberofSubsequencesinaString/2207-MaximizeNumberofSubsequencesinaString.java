// Last updated: 12/29/2025, 7:41:02 PM
1class Solution {
2    public long maximumSubsequenceCount(String s, String pattern) {
3        long res = 0, cnt1 = 0, cnt2 = 0;
4        for (int i = 0; i < s.length(); ++i) {   
5            if (s.charAt(i) == pattern.charAt(1)) {   
6                res += cnt1; 
7                cnt2++;
8            }
9            if (s.charAt(i) == pattern.charAt(0)) {   
10                cnt1++;
11            }
12        }
13        return res + Math.max(cnt1, cnt2);
14
15
16
17    }
18}