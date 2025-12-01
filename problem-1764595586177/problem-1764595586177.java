// Last updated: 12/1/2025, 6:56:26 PM
1class Solution {
2    int mod = 1000000007;   // FIXED
3
4    public int numberOfWays(int n, int x) {
5        long [][] dp = new long[n+1][n+1];
6        for(long[] a : dp){
7            Arrays.fill(a,-1L);
8        }
9        return (int)helper(n, x, 1, dp);
10    }
11
12    public long helper(int n, int x, int c, long[][] dp){
13        if(n==0){
14            return 1;
15        }
16        if(n<0){
17            return 0;
18        }
19        if(dp[n][c]!=-1){
20            return dp[n][c];
21        }
22
23        int r = c;
24        long ans = 0;
25
26        while (true) {
27            long p = power(r, x);      // FIXED
28            if (p > n) break;
29
30            long q = helper((int)(n - p), x, r + 1, dp) % mod;
31            ans = (ans + q) % mod;
32
33            r++;
34        }
35
36        return dp[n][c] = ans;
37    }
38
39    // integer power (FIXED for precision)
40    private long power(int base, int exp) {
41        long res = 1;
42        for (int i = 0; i < exp; i++) {
43            res *= base;
44        }
45        return res;
46    }
47}
48