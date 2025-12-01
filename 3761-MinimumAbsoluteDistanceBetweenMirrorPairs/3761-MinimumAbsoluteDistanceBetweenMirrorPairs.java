// Last updated: 12/1/2025, 10:12:02 PM
1class Solution {
2    private int reverse(int a) {
3        int b = 0;
4        while (a > 0) {
5            b = b * 10 + a % 10;
6            a /= 10;
7        }
8        return b;
9    }
10
11    public int minMirrorPairDistance(int[] A) {
12        Map<Integer, Integer> pre = new HashMap<>();
13        int n = A.length, res = n;
14        for (int i = 0; i < n; ++i) {
15            if (pre.containsKey(A[i])) {
16                res = Math.min(res, i - pre.get(A[i]));
17            }
18            pre.put(reverse(A[i]), i);
19        }
20
21        return (res < n) ? res : -1;
22    }
23
24}