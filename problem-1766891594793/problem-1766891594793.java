// Last updated: 12/28/2025, 8:43:14 AM
1class Solution {
2    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
3        long qw  =  cost1+cost2;
4        qw = Math.min(qw, costBoth);
5        long d = Math.min(need1, need2);
6        long ans = qw*d;
7        long n1 = need1-d;
8        
9        long n2= need2-d;
10        long c1=cost1, c2= cost2;
11        if(qw<cost1){
12            c1=qw;
13        }
14        if(qw<cost2){
15            c2=qw;
16        }
17        ans+=n1*c1+n2*c2;
18        return ans;
19        
20        
21    }
22}