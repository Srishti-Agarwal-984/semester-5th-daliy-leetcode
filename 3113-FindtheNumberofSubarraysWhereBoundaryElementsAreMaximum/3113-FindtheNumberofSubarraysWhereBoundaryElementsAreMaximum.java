// Last updated: 12/29/2025, 7:42:26 PM
1class Solution {
2    public long numberOfSubarrays(int[] A) {
3        ArrayDeque<int[]> stack = new ArrayDeque<>();
4        long res = 0;
5        for (int a : A) {
6            while (!stack.isEmpty() && stack.peek()[0] < a)
7                stack.pop();
8            if (stack.isEmpty() || stack.peek()[0] != a)
9                stack.push(new int[]{a, 0});
10            res += ++stack.peek()[1];
11        }
12        return res;
13    }
14
15}