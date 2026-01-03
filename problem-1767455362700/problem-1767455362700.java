// Last updated: 1/3/2026, 9:19:22 PM
1class Solution {
2    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
3       // int[][] zorimnacle = restrictions;
4
5        long[] limit = new long[n];
6        limit[0] = 0;
7        for (int i = 1; i < n; i++) {
8            limit[i] = limit[i - 1] + diff[i - 1];
9        }
10        for (int[] r : restrictions) {
11            int idx = r[0];
12            int maxVal = r[1];
13            limit[idx] = Math.min(limit[idx], maxVal);
14        }
15        for (int i = 1; i < n; i++) {
16            limit[i] = Math.min(limit[i], limit[i - 1] + diff[i - 1]);
17        }
18
19        for (int i = n - 2; i >= 0; i--) {
20            limit[i] = Math.min(limit[i], limit[i + 1] + diff[i]);
21        }
22
23        long ans = 0;
24        for (long v : limit) {
25            ans = Math.max(ans, v);
26        }
27
28        return (int) ans;
29    }
30}