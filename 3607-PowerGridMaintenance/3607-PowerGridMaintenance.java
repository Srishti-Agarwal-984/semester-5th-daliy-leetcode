// Last updated: 12/8/2025, 5:44:32 PM
1import java.util.*;
2
3class Solution {
4    int[] parent, size;
5    Map<Integer, PriorityQueue<Integer>> mp = new HashMap<>();
6
7    int findParent(int node) {
8        if (parent[node] == node) return node;
9        return parent[node] = findParent(parent[node]);
10    }
11
12    void Union(int u, int v) {
13        int up = findParent(u);
14        int vp = findParent(v);
15
16        if (up == vp) return;
17
18        if (size[up] > size[vp]) {
19            size[up] += size[vp];
20            parent[vp] = up;
21            PriorityQueue<Integer> pqV = mp.get(vp);
22            PriorityQueue<Integer> pqU = mp.get(up);
23            while (!pqV.isEmpty()) pqU.offer(pqV.poll());
24        } else {
25            size[vp] += size[up];
26            parent[up] = vp;
27            PriorityQueue<Integer> pqU = mp.get(up);
28            PriorityQueue<Integer> pqV = mp.get(vp);
29            while (!pqU.isEmpty()) pqV.offer(pqU.poll());
30        }
31    }
32
33    public int[] processQueries(int c, int[][] connections, int[][] queries) {
34        parent = new int[c];
35        size = new int[c];
36        boolean[] offline = new boolean[c];
37
38        for (int i = 0; i < c; i++) {
39            parent[i] = i;
40            size[i] = 1;
41            PriorityQueue<Integer> pq = new PriorityQueue<>();
42            pq.offer(i);
43            mp.put(i, pq);
44        }
45
46        for (int[] conn : connections) {
47            int u = conn[0] - 1, v = conn[1] - 1;
48            Union(u, v);
49        }
50
51        List<Integer> ans = new ArrayList<>();
52
53        for (int[] q : queries) {
54            int type = q[0];
55            int node = q[1] - 1;
56
57            if (type == 1) {
58                if (!offline[node]) {
59                    ans.add(node + 1);
60                    continue;
61                }
62                int par = findParent(node);
63                PriorityQueue<Integer> pq = mp.get(par);
64                while (!pq.isEmpty() && offline[pq.peek()]) pq.poll();
65                ans.add(pq.isEmpty() ? -1 : pq.peek() + 1);
66            } else {
67                offline[node] = true;
68            }
69        }
70
71        return ans.stream().mapToInt(i -> i).toArray();
72    }
73}
74