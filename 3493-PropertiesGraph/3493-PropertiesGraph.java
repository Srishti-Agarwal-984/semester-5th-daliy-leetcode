// Last updated: 1/23/2026, 2:50:52 PM
1class Solution {
2    public int numberOfComponents(int[][] properties, int k) {
3        HashSet<Integer>[] st = new HashSet[properties.length];
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5
6        for (int i = 0; i < properties.length; i++) {
7            map.put(i, new HashSet<>());
8            HashSet<Integer> hj = new HashSet<>();
9            for (int j = 0; j < properties[i].length; j++) {
10                hj.add(properties[i][j]);
11            }
12            st[i] = hj;
13        }
14
15        for (int i = 0; i < properties.length; i++) {
16            for (int j = i + 1; j < properties.length; j++) {
17                int c = 0;
18                for (int r : st[i]) {
19                    if (st[j].contains(r)) {
20                        c++;
21                    }
22                }
23                if (c >= k) {
24                    map.get(i).add(j);
25                    map.get(j).add(i);
26                }
27            }
28        }
29
30        HashSet<Integer> vi = new HashSet<>(); // fixed HashSet
31        int count = 0;
32
33        for (int i = 0; i < st.length; i++) {
34            if (vi.contains(i)) {
35                continue;
36            }
37            Queue<Integer> q = new LinkedList<>();
38            q.add(i);
39
40            while (!q.isEmpty()) {
41                int r = q.poll(); // fixed syntax
42                if (vi.contains(r)) {
43                    continue;
44                }
45                vi.add(r);
46                for (int nbrs : map.get(r)) {
47                    if (!vi.contains(nbrs)) {
48                        q.add(nbrs);
49                    }
50                }
51            }
52            count++;
53        }
54        return count;
55    }
56}
57