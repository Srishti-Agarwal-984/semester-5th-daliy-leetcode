// Last updated: 12/7/2025, 8:35:06 PM
1class Solution {
2    public int maxRotateFunction(int[] A) {
3        if (A == null || A.length == 0)
4            return 0;
5        int sum = 0, F0 = 0, max = Integer.MIN_VALUE;
6        for (int i = 0; i < A.length; i++) {
7            sum += A [i];
8            F0 += i * A [i];
9        }
10        int dp [] = new int [A.length];
11        dp [0] = F0;
12        max = dp [0];
13        for (int i = 1; i < A.length; i++) {
14            dp [i] = dp [i-1] + sum - A.length * A [A.length - i];
15            max = Math.max (max, dp [i]);
16        }
17        return max;
18        
19
20        
21    }
22}