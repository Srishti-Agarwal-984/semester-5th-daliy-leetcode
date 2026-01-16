// Last updated: 1/16/2026, 10:18:05 AM
1import java.util.HashSet;
2
3class Solution {
4    int mod = 1000000007;
5
6    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
7
8        // include borders
9        int[] h = new int[hFences.length + 2];
10        int[] v = new int[vFences.length + 2];
11
12        h[0] = 1;
13        h[1] = m;
14        for (int i = 0; i < hFences.length; i++) {
15            h[i + 2] = hFences[i];
16        }
17
18        v[0] = 1;
19        v[1] = n;
20        for (int i = 0; i < vFences.length; i++) {
21            v[i + 2] = vFences[i];
22        }
23
24        // all horizontal distances
25        HashSet<Integer> st = new HashSet<>();
26        for (int i = 0; i < h.length; i++) {
27            for (int j = i + 1; j < h.length; j++) {
28                st.add(Math.abs(h[i] - h[j]));
29            }
30        }
31
32        long ans = -1;
33
34        // match vertical distances
35        for (int i = 0; i < v.length; i++) {
36            for (int j = i + 1; j < v.length; j++) {
37                int d = Math.abs(v[i] - v[j]);
38                if (st.contains(d)) {
39                    ans = Math.max(ans, (long) d * d);
40                }
41            }
42        }
43
44        return ans == -1 ? -1 : (int) (ans % mod);
45    }
46}
47