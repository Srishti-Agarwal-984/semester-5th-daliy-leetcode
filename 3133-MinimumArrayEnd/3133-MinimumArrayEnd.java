// Last updated: 12/26/2025, 10:46:40 PM
1class Solution {
2    public long minEnd(int n, int x) {
3        
4        return x | Long.expand(n - 1, ~(long)x);
5
6
7        
8        
9    }
10}