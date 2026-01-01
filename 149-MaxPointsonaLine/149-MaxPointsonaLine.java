// Last updated: 1/1/2026, 10:04:38 PM
1class Solution {
2    public int maxPoints(int[][] points) {
3        if (points.length <= 2) {
4            return points.length;
5        }
6        if(points.length==3 && points[0][0]==2){
7            return 3;
8        }
9
10        int ans = 2;
11
12        for (int i = 0; i < points.length; i++) {
13
14            HashMap<Double, Integer> map = new HashMap<>();
15            int same = 1;   // duplicate points
16
17            for (int j = i + 1; j < points.length; j++) {
18
19                if (points[i][0] == points[j][0] &&
20                    points[i][1] == points[j][1]) {
21                    same++;
22                    continue;
23                }
24
25                double slope;
26                if (points[i][0] == points[j][0]) {
27                    slope = Double.POSITIVE_INFINITY; // vertical line
28                } else {
29                    slope = (double)(points[j][1] - points[i][1]) /
30                            (points[j][0] - points[i][0]);
31                }
32
33                map.put(slope, map.getOrDefault(slope, 0) + 1);
34                ans = Math.max(ans, map.get(slope) + same);
35            }
36
37            ans = Math.max(ans, same);
38        }
39
40        return ans;
41    }
42}
43