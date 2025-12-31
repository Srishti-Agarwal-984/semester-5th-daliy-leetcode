// Last updated: 12/31/2025, 10:39:17 PM
1import java.util.*;
2
3class Solution {
4    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
5
6        double[] ans = new double[n];
7        Arrays.fill(ans, 0.0);
8
9        Map<Integer, HashMap<Integer, Double>> map = new HashMap<>();
10        for (int i = 0; i < n; i++) {
11            map.put(i, new HashMap<>());
12        }
13
14        for (int i = 0; i < edges.length; i++) {
15            map.get(edges[i][0]).put(edges[i][1], succProb[i]);
16            map.get(edges[i][1]).put(edges[i][0], succProb[i]);
17        }
18
19        PriorityQueue<Pair> pq =
20                new PriorityQueue<>((a, b) -> Double.compare(b.val, a.val));
21
22        HashSet<Integer> vi = new HashSet<>();
23
24        pq.add(new Pair(start_node, 1.0));
25
26        while (!pq.isEmpty()) {
27            Pair p = pq.poll();
28
29            if (vi.contains(p.e)) continue;
30            vi.add(p.e);
31
32            ans[p.e] = p.val;
33
34            for (int u : map.get(p.e).keySet()) {
35                double r = map.get(p.e).get(u);
36                if (!vi.contains(u) && ans[p.e] * r > ans[u]) {
37                    pq.add(new Pair(u, ans[p.e] * r));
38                }
39            }
40        }
41
42        return ans[end_node];
43    }
44
45    class Pair {
46        int e;
47        double val;
48        Pair(int e, double val) {
49            this.e = e;
50            this.val = val;
51        }
52    }
53}
54