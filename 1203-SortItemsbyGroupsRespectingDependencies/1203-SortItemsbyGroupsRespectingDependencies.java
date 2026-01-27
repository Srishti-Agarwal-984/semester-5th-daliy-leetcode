// Last updated: 1/27/2026, 3:08:47 PM
1class Solution {
2
3    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
4
5        HashMap<Integer, List<Integer>> map1 = new HashMap<>();
6        HashMap<Integer, List<Integer>> map2 = new HashMap<>();
7
8        // -1 groups ko unique group do
9        for (int i = 0; i < group.length; i++) {
10            if (group[i] == -1) {
11                group[i] = m++;
12            }
13        }
14
15        // item graph
16        for (int i = 0; i < n; i++) {
17            map1.put(i, new ArrayList<>());
18        }
19
20        // group graph
21        for (int i = 0; i < m; i++) {
22            map2.put(i, new ArrayList<>());
23        }
24
25        // graphs build
26        for (int i = 0; i < n; i++) {
27            for (int j : beforeItems.get(i)) {
28
29                // FIX 1
30                map1.get(j).add(i);
31
32                if (group[i] != group[j]) {
33                    // FIX 2
34                    map2.get(group[j]).add(group[i]);
35                }
36            }
37        }
38
39        // FIX 3: helper -> toposort
40        List<Integer> el = toposort(map1);
41        List<Integer> g  = toposort(map2);
42
43        if (el.size() == 0 || g.size() == 0) {
44            return new int[]{};
45        }
46
47        HashMap<Integer, List<Integer>> op = new HashMap<>();
48        for (int i = 0; i < m; i++) {
49            op.put(i, new ArrayList<>());
50        }
51
52        for (int i : el) {
53            op.get(group[i]).add(i);
54        }
55
56        int[] ans = new int[n];
57        int r = 0;
58
59        for (int gr : g) {
60            for (int qw : op.get(gr)) {
61                ans[r++] = qw;
62            }
63        }
64
65        return ans;
66    }
67
68    public List<Integer> toposort(HashMap<Integer, List<Integer>> map) {
69
70        int n = map.size();
71        int[] indeg = new int[n];
72
73        for (int i = 0; i < n; i++) {
74            for (int el : map.get(i)) {
75                indeg[el]++;
76            }
77        }
78
79        Queue<Integer> q = new LinkedList<>();
80        for (int i = 0; i < n; i++) {
81            if (indeg[i] == 0) {
82                q.add(i);
83            }
84        }
85
86        List<Integer> ans = new ArrayList<>();
87        while (!q.isEmpty()) {
88            int el = q.poll();
89            ans.add(el);
90            for (int nbrs : map.get(el)) {
91                indeg[nbrs]--;
92                if (indeg[nbrs] == 0) {
93                    q.add(nbrs);
94                }
95            }
96        }
97
98        return ans.size() == map.size() ? ans : new ArrayList<>();
99    }
100}
101