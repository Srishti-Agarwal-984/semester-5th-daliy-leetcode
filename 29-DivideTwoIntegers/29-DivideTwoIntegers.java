// Last updated: 12/17/2025, 4:45:50 AM
1class Solution {
2    public int divide(int dividend, int divisor) {
3        int a;
4        if(dividend==-2147483648 && divisor==-1 ){
5            return 2147483647;
6        }
7        a=(dividend/divisor);
8        return a;
9        
10    }
11}