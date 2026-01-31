// Last updated: 1/31/2026, 2:01:16 PM
1class Solution {
2    public int mod = 1_000_000_007;
3    public int minNonZeroProduct(int p) {
4        if (p == 1) return 1;
5        
6        long mx = (long)(Math.pow(2, p)) - 1;
7        long sm = mx - 1;
8        long n = sm/2;
9        long sum = rec(sm, n);
10        
11        return (int)(sum * (mx % mod) % mod); 
12    }
13    
14    public long rec(long val, long n) {
15        if (n == 0) return 1;
16        if (n == 1) return (val % mod);
17        
18        long newVal = ((val % mod) * (val % mod)) % mod;
19        
20        if (n % 2 != 0) {
21            return ((rec(newVal, n/2) % mod) * (val % mod)) % mod;
22        }
23        
24        return rec(newVal, n/2) % mod;
25    }
26}