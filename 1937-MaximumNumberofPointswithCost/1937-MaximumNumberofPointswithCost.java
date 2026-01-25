// Last updated: 1/25/2026, 8:12:45 AM
1class Solution {
2    public long maxPoints(int[][] points) {
3        int m = points.length, n = points[0].length;
4        long[] prev = new long[n];
5
6        for (int j = 0; j < n; j++) {
7            prev[j] = points[0][j];
8        }
9
10        for (int i = 1; i < m; i++) {
11            long[] curr = new long[n];
12
13            long best = Long.MIN_VALUE;
14            for (int j = 0; j < n; j++) {
15                best = Math.max(best, prev[j] + j);
16                curr[j] = best - j + points[i][j];
17            }
18
19            best = Long.MIN_VALUE;
20            for (int j = n - 1; j >= 0; j--) {
21                best = Math.max(best, prev[j] - j);
22                curr[j] = Math.max(curr[j], best + j + points[i][j]);
23            }
24
25            prev = curr;
26        }
27
28        long ans = 0;
29        for (long v : prev) ans = Math.max(ans, v);
30        return ans;
31    }
32}
33