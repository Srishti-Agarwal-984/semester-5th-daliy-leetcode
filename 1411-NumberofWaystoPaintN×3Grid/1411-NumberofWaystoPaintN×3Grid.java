// Last updated: 1/3/2026, 9:03:20 AM
1class Solution {
2    int MOD = 1000000007;
3
4    public int numOfWays(int n) {
5        long[] a = new long[n];
6        long[] b = new long[n];
7
8        a[0] = 6;
9        b[0] = 6;
10
11        for (int i = 1; i < n; i++) {
12            a[i] = (2 * a[i - 1] + 2 * b[i - 1]) % MOD;
13            b[i] = (2 * a[i - 1] + 3 * b[i - 1]) % MOD;
14        }
15
16        return (int)((a[n - 1] + b[n - 1]) % MOD);
17    }
18}