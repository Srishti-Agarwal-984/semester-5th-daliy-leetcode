// Last updated: 1/24/2026, 9:14:01 PM
1class Solution {
2
3    public int maximumDetonation(int[][] bombs) {
4        int n = bombs.length;
5        List<List<Integer>> graph = new ArrayList<>();
6
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10
11        // build directed graph
12        for (int i = 0; i < n; i++) {
13            for (int j = 0; j < n; j++) {
14                if (i != j && canDetonate(bombs[i], bombs[j])) {
15                    graph.get(i).add(j);
16                }
17            }
18        }
19
20        int ans = 1;
21
22        // BFS from each bomb
23        for (int i = 0; i < n; i++) {
24            Queue<Integer> q = new LinkedList<>();
25            boolean[] vis = new boolean[n];
26            q.add(i);
27            vis[i] = true;
28            int count = 1;
29
30            while (!q.isEmpty()) {
31                int cur = q.poll();
32                for (int nei : graph.get(cur)) {
33                    if (!vis[nei]) {
34                        vis[nei] = true;
35                        count++;
36                        q.add(nei);
37                    }
38                }
39            }
40            ans = Math.max(ans, count);
41        }
42
43        return ans;
44    }
45
46    private boolean canDetonate(int[] a, int[] b) {
47        long dx = a[0] - b[0];
48        long dy = a[1] - b[1];
49        long r = a[2];
50        return dx * dx + dy * dy <= r * r;
51    }
52}
53