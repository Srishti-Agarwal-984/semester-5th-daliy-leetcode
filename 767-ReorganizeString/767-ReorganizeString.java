// Last updated: 1/2/2026, 8:24:05 PM
1class Solution {
2    public String reorganizeString(String s) {
3
4        int[] freq = new int[26];
5        for (char c : s.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        PriorityQueue<Pair> pq = new PriorityQueue<>(
10            (a, b) -> b.val - a.val
11        );
12
13        for (int i = 0; i < 26; i++) {
14            if (freq[i] > 0) {
15                pq.add(new Pair((char)(i + 'a'), freq[i]));
16            }
17        }
18
19        StringBuilder sb = new StringBuilder();
20
21        while (pq.size() > 1) {
22            Pair p1 = pq.poll();
23            Pair p2 = pq.poll();
24
25            sb.append(p1.ch);
26            sb.append(p2.ch);
27
28            if (--p1.val > 0) pq.add(p1);
29            if (--p2.val > 0) pq.add(p2);
30        }
31
32        if (!pq.isEmpty()) {
33            Pair last = pq.poll();
34            if (last.val > 1) return "";
35            sb.append(last.ch);
36        }
37
38        return sb.toString();
39    }
40
41    class Pair {
42        char ch;
43        int val;
44        Pair(char ch, int val) {
45            this.ch = ch;
46            this.val = val;
47        }
48    }
49}
50