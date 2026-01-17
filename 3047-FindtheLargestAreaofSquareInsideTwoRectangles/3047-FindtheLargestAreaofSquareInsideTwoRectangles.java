// Last updated: 1/17/2026, 7:46:31 AM
1class Solution {
2    public long largestSquareArea(int[][] bl, int[][] tr) {
3        long ans = 0;
4        for (int i = 0; i < bl.length; i++) {
5            for (int j = i + 1; j < bl.length; j++) {
6                long bl1 = Math.max(bl[i][0], bl[j][0]);
7                long bl2 = Math.max(bl[i][1], bl[j][1]);
8                long tr1 = Math.min(tr[i][0], tr[j][0]);
9                long tr2 = Math.min(tr[i][1], tr[j][1]);
10                long u = Math.min(tr1 - bl1, tr2 - bl2);
11                if (u < 0) {
12                    continue;
13                }
14                ans = Math.max(ans, u * u);
15
16            }
17        }
18        return ans;
19
20    }
21}