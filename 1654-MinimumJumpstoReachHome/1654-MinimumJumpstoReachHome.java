// Last updated: 1/6/2026, 5:40:23 PM
1import java.util.*;
2
3class Solution {
4    public int minimumJumps(int[] forbidden, int a, int b, int x) {
5
6        // forbidden positions
7        Set<Integer> ban = new HashSet<>();
8        int maxForbidden = 0;
9        for (int f : forbidden) {
10            ban.add(f);
11            maxForbidden = Math.max(maxForbidden, f);
12        }
13
14        int limit = Math.max(x, maxForbidden) + a + b;
15        boolean[][] visited = new boolean[limit + 1][2];
16
17        // Queue: {position, lastWasBackward(0/1), steps}
18        Queue<int[]> q = new LinkedList<>();
19        q.offer(new int[]{0, 0, 0});
20        visited[0][0] = true;
21
22        while (!q.isEmpty()) {
23            int[] cur = q.poll();
24            int pos = cur[0];
25            int lastBack = cur[1];
26            int steps = cur[2];
27
28            if (pos == x) {
29                return steps;
30            }
31
32            // -------- forward jump --------
33            int forward = pos + a;
34            if (forward <= limit && !ban.contains(forward) && !visited[forward][0]) {
35                visited[forward][0] = true;
36                q.offer(new int[]{forward, 0, steps + 1});
37            }
38
39            // -------- backward jump --------
40            if (lastBack == 0) {
41                int backward = pos - b;
42                if (backward >= 0 && !ban.contains(backward) && !visited[backward][1]) {
43                    visited[backward][1] = true;
44                    q.offer(new int[]{backward, 1, steps + 1});
45                }
46            }
47        }
48
49        return -1;
50    }
51}
52