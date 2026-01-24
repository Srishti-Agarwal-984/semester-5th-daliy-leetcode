// Last updated: 1/24/2026, 9:14:55 PM
1class Solution {
2
3    public int maximumDetonation(int[][] bombs) {
4
5        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
6
7        for (int i = 0; i < bombs.length; i++) {
8            map.put(i, new HashSet<>());
9        }
10
11        // build DIRECTED graph
12        for (int i = 0; i < bombs.length; i++) {
13            for (int j = 0; j < bombs.length; j++) {
14                if (i == j) continue;
15
16                if (helper(
17                        bombs[i][0], bombs[i][1], bombs[i][2],
18                        bombs[j][0], bombs[j][1], bombs[j][2]
19                )) {
20                    map.get(i).add(j); // only i -> j
21                }
22            }
23        }
24
25        int ans = 1;
26
27        for (int i = 0; i < bombs.length; i++) {
28            HashSet<Integer> vi = new HashSet<>();
29            Queue<Integer> q = new LinkedList<>();
30            q.add(i);
31
32            while (!q.isEmpty()) {
33                int r = q.poll();
34                if (vi.contains(r)) continue;
35
36                vi.add(r);
37
38                for (int nbrs : map.get(r)) {
39                    if (!vi.contains(nbrs)) {
40                        q.add(nbrs);
41                    }
42                }
43            }
44
45            ans = Math.max(ans, vi.size());
46        }
47
48        return ans;
49    }
50
51    // distance-based check
52    public boolean helper(int x1, int y1, int r1, int x2, int y2, int r2) {
53        long dx = x1 - x2;
54        long dy = y1 - y2;
55        return dx * dx + dy * dy <= (long) r1 * r1;
56    }
57}
58