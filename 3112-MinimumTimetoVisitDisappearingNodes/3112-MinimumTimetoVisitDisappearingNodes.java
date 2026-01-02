// Last updated: 1/2/2026, 7:10:36 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3
4        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
5        for (int i = 0; i < n; i++) map.put(i, new HashMap<>());
6
7        for (int[] e : edges) {
8            int u = e[0], v = e[1], w = e[2];
9            map.get(u).put(v, Math.min(map.get(u).getOrDefault(v, Integer.MAX_VALUE), w));
10            map.get(v).put(u, Math.min(map.get(v).getOrDefault(u, Integer.MAX_VALUE), w));
11        }
12
13        int[] ans = new int[n];
14        Arrays.fill(ans, Integer.MAX_VALUE);
15
16        if (disappear[0] == 0) {
17            Arrays.fill(ans, -1);
18            return ans;
19        }
20
21        PriorityQueue<Pair> pq = new PriorityQueue<>(
22            (a, b) -> Integer.compare(a.val, b.val)
23        );
24
25        ans[0] = 0;
26        pq.add(new Pair(0, 0));
27
28        while (!pq.isEmpty()) {
29            Pair cur = pq.poll();
30
31            if (cur.val > ans[cur.ei]) continue;
32            if (cur.val >= disappear[cur.ei]) continue;
33
34            for (int nei : map.get(cur.ei).keySet()) {
35                int newVal = cur.val + map.get(cur.ei).get(nei);
36                if (newVal < ans[nei] && newVal < disappear[nei]) {
37                    ans[nei] = newVal;
38                    pq.add(new Pair(nei, newVal));
39                }
40            }
41        }
42
43        for (int i = 0; i < n; i++) {
44            if (ans[i] == Integer.MAX_VALUE) ans[i] = -1;
45        }
46
47        return ans;
48    }
49
50    class Pair {
51        int ei, val;
52        Pair(int ei, int val) {
53            this.ei = ei;
54            this.val = val;
55        }
56    }
57}
58