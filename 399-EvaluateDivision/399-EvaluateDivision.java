// Last updated: 1/24/2026, 8:32:14 PM
1class Solution {
2
3    class Pair {
4        String s;
5        double val;
6        Pair(String s, double val) {
7            this.s = s;
8            this.val = val;
9        }
10    }
11
12    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
13        HashMap<String, HashMap<String, Double>> map = new HashMap<>();
14        int p = 0;
15
16        for (List<String> li : equations) {
17            String a = li.get(0);
18            String b = li.get(1);
19            double v = values[p++];
20
21            map.putIfAbsent(a, new HashMap<>());
22            map.putIfAbsent(b, new HashMap<>());
23
24            map.get(a).put(b, v);
25            map.get(b).put(a, 1.0 / v);
26        }
27
28        double[] ans = new double[queries.size()];
29        Arrays.fill(ans, -1.0);
30
31        for (int i = 0; i < queries.size(); i++) {
32            String src = queries.get(i).get(0);
33            String dest = queries.get(i).get(1);
34
35            if (!map.containsKey(src) || !map.containsKey(dest)) {
36                continue;
37            }
38
39            HashSet<String> vis = new HashSet<>();
40            Queue<Pair> q = new LinkedList<>();
41            q.add(new Pair(src, 1.0));
42
43            while (!q.isEmpty()) {
44                Pair r = q.poll();
45
46                if (r.s.equals(dest)) {
47                    ans[i] = r.val;
48                    break;   // ✅ stop BFS
49                }
50
51                if (vis.contains(r.s)) continue;
52                vis.add(r.s);
53
54                for (String nei : map.get(r.s).keySet()) {
55                    if (!vis.contains(nei)) {
56                        q.add(new Pair(nei, r.val * map.get(r.s).get(nei)));
57                    }
58                }
59            }
60        }
61        return ans;
62    }
63}
64