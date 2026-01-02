// Last updated: 1/2/2026, 8:25:11 PM
1class Solution {
2    public String reorganizeString(String s) {
3
4        int[] freq = new int[26];
5        for (char c : s.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        int max = 0;
10        for (int f : freq) max = Math.max(max, f);
11        if (max > (s.length() + 1) / 2) return "";
12
13        PriorityQueue<Pair> pq = new PriorityQueue<>(
14            (a, b) -> b.val - a.val
15        );
16
17        for (int i = 0; i < 26; i++) {
18            if (freq[i] > 0) {
19                pq.add(new Pair((char)(i + 'a'), freq[i]));
20            }
21        }
22
23        char[] res = new char[s.length()];
24        int idx = 0;
25
26        while (!pq.isEmpty()) {
27            Pair cur = pq.poll();
28
29            while (cur.val > 0) {
30                if (idx >= s.length()) idx = 1; // switch to odd indices
31                res[idx] = cur.ch;
32                idx += 2;
33                cur.val--;
34            }
35        }
36
37        return new String(res);
38    }
39
40    class Pair {
41        char ch;
42        int val;
43        Pair(char ch, int val) {
44            this.ch = ch;
45            this.val = val;
46        }
47    }
48}
49