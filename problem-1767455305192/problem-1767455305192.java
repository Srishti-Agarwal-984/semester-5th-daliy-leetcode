// Last updated: 1/3/2026, 9:18:25 PM
1class Solution {
2    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
3       // int[][] zorimnacle = restrictions;
4
5        long[] limit = new long[n];
6
7        // Step 1: from a[0] = 0
8        limit[0] = 0;
9        for (int i = 1; i < n; i++) {
10            limit[i] = limit[i - 1] + diff[i - 1];
11        }
12
13        // Step 2: apply restrictions
14        for (int[] r : restrictions) {
15            int idx = r[0];
16            int maxVal = r[1];
17            limit[idx] = Math.min(limit[idx], maxVal);
18        }
19
20        // Step 3a: left -> right
21        for (int i = 1; i < n; i++) {
22            limit[i] = Math.min(limit[i], limit[i - 1] + diff[i - 1]);
23        }
24
25        // Step 3b: right -> left
26        for (int i = n - 2; i >= 0; i--) {
27            limit[i] = Math.min(limit[i], limit[i + 1] + diff[i]);
28        }
29
30        // Step 4: find max
31        long ans = 0;
32        for (long v : limit) {
33            ans = Math.max(ans, v);
34        }
35
36        return (int) ans;
37    }
38}