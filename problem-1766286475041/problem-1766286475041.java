// Last updated: 12/21/2025, 8:37:55 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        int r =0;
4        int r1 = n;
5        while(n!=0){
6            r = r*10+n%10;
7            n=n/10;
8        }
9        return Math.abs(r-r1);
10        
11    }
12}