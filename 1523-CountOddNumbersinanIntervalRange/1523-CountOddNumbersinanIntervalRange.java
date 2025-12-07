// Last updated: 12/7/2025, 5:55:15 AM
1class Solution {
2    public int countOdds(int low, int high) {
3        int c=high-low+1;
4        if((low%2!=0 && high%2==0) || (low%2==0 && high%2!=0)){
5            return c/2;
6        }
7        if((low%2==0 && high%2==0) ){
8            c=c-1;
9            return (c/2);
10        }
11
12        c=c-1;
13        return (c/2)+1;
14        
15    }
16}