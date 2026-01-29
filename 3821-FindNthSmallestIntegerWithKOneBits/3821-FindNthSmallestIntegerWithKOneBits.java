// Last updated: 1/29/2026, 10:45:53 PM
1class Solution {
2    public long nthSmallest(long n, int k) {
3        long[][] comb = new long[51][51];
4        for (int i = 0; i <= 50; i++) {
5            comb[i][0] = 1;
6            for (int j = 1; j <= i; j++) {
7                comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
8            }
9        }
10        long res = 0;
11        for (int i = 49; i >= 0; i--) {
12            long c = comb[i][k];
13            if (n > c) {
14                res |= (1L << i);
15                n -= c;
16                if (--k == 0) break;
17            }
18        }
19        return res;
20        
21    }
22}