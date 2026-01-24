// Last updated: 1/24/2026, 9:19:12 PM
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
11        for (int i = 0; i < bombs.length; i++) {
12            for (int j = i + 1; j < bombs.length; j++) {
13
14                if (helper(
15                        bombs[i][0], bombs[i][1], bombs[i][2],
16                        bombs[j][0], bombs[j][1], bombs[j][2]
17                )) {
18                    map.get(i).add(j);
19                }
20
21                if (helper(
22                        bombs[j][0], bombs[j][1], bombs[j][2],
23                        bombs[i][0], bombs[i][1], bombs[i][2]
24                )) {
25                    map.get(j).add(i);
26                }
27            }
28        }
29
30        int ans = 1;
31
32        for (int i = 0; i < bombs.length; i++) {
33            HashSet<Integer> vi = new HashSet<>();
34            Queue<Integer> q = new LinkedList<>();
35            q.add(i);
36
37            while (!q.isEmpty()) {
38                int r = q.poll();
39                if (vi.contains(r)) continue;
40
41                vi.add(r);
42
43                for (int nbrs : map.get(r)) {
44                    if (!vi.contains(nbrs)) {
45                        q.add(nbrs);
46                    }
47                }
48            }
49
50            ans = Math.max(ans, vi.size());
51        }
52
53        return ans;
54    }
55
56    public boolean helper(int x1, int y1, int r1, int x2, int y2, int r2) {
57        long dx = x1 - x2;
58        long dy = y1 - y2;
59        return dx * dx + dy * dy <= (long) r1 * r1;
60    }
61}
62