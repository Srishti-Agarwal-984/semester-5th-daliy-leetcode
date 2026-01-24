// Last updated: 1/24/2026, 8:48:43 PM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        int[] f1 = new int[26];
4        int[] f2 = new int[26];
5
6        for (char c : word1.toCharArray()) f1[c - 'a']++;
7        for (char c : word2.toCharArray()) f2[c - 'a']++;
8
9        int d1 = distinct(f1);
10        int d2 = distinct(f2);
11
12        for (int i = 0; i < 26; i++) {
13            if (f1[i] == 0) continue;
14
15            for (int j = 0; j < 26; j++) {
16                if (f2[j] == 0) continue;
17
18                // simulate swap
19                f1[i]--; f1[j]++;
20                f2[j]--; f2[i]++;
21
22                if (distinct(f1) == distinct(f2)) {
23                    return true;
24                }
25
26                // revert swap
27                f1[i]++; f1[j]--;
28                f2[j]++; f2[i]--;
29            }
30        }
31        return false;
32    }
33
34    private int distinct(int[] f) {
35        int c = 0;
36        for (int x : f) if (x > 0) c++;
37        return c;
38    }
39}
40