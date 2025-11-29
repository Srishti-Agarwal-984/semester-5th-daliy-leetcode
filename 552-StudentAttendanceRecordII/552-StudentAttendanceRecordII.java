// Last updated: 11/29/2025, 6:17:59 PM
1class Solution {
2    int mod=1000000007;
3    public int checkRecord(int n) {
4        long[][][] dp = new long[n+1][2][3];
5        for (long[][] i :dp)
6            for (long[] j :i)
7                Arrays.fill(j, -1);
8        return (int)helper(n, 0,0, dp);
9        
10    }
11    public long helper(int n, int a, int l, long[][][] dp){
12        if(n==0){
13            //System.out.println("s");
14            return 1;
15        }
16        if(dp[n][a][l]!=-1){
17            return dp[n][a][l];
18        }
19        long p1 = helper(n-1, a, 0, dp)%mod;
20        long a1=0;
21        if(a==0){
22            a1+=helper(n-1, a+1, 0, dp)%mod;
23        }
24        long l1=0;
25        if(l<2){
26            l1+=helper(n-1,a, l+1, dp)%mod;
27        }
28        
29        p1=(p1+a1)%mod;
30        p1=(p1+l1)%mod;
31        return dp[n][a][l]=p1;
32
33    }
34}