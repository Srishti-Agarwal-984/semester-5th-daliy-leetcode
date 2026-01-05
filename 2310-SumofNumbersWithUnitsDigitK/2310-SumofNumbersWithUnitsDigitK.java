// Last updated: 1/5/2026, 12:39:27 PM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if (num == 0) return 0;
4
5        for (int count = 1; count <= 10; count++) {
6            if ((count * k) % 10 == num % 10 && count * k <= num) {
7                return count;
8            }
9        }
10        return -1;
11
12
13        
14    }
15}