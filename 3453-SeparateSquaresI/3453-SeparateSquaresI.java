// Last updated: 1/13/2026, 1:30:07 PM
1class Solution {
2    public double separateSquares(int[][] squares) {
3        double area = 0.0;
4        double st = Double.MAX_VALUE, en = -Double.MAX_VALUE;
5
6        for (int i = 0; i < squares.length; i++) {
7            st = Math.min(st, squares[i][1]);
8            en = Math.max(en, squares[i][1] + squares[i][2]);
9            area += (double) squares[i][2] * squares[i][2];
10        }
11
12        area /= 2.0;
13
14        // binary search on double
15        while (en - st > 1e-6) {
16            double mid = st + (en - st) / 2.0;
17            double df = helper(mid, squares);
18
19            if (df >= area) {
20                en = mid;     
21            } else {
22                st = mid;     
23            }
24        }
25        return st;
26    }
27
28    public double helper(double mid, int[][] squares) {
29        double sum = 0;
30        for (int i = 0; i < squares.length; i++) {
31            double start = squares[i][1];
32            double end = squares[i][1] + squares[i][2];
33            if (start <= mid) {
34                if (end >= mid) {
35                    sum += (mid - start) * squares[i][2];
36                } else {
37                    sum += (double) squares[i][2] * squares[i][2];
38                }
39            }
40        }
41        return sum;
42    }
43}
44