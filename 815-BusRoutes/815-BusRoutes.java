// Last updated: 1/28/2026, 6:20:39 AM
1class Solution {
2    public int numBusesToDestination(int[][] routes, int source, int target) {
3
4        if (source == target) return 0;
5
6        // route -> stops
7        HashMap<Integer, HashSet<Integer>> g = new HashMap<>();
8        int max = 0;
9
10        for (int i = 0; i < routes.length; i++) {
11            g.put(i, new HashSet<>());
12            for (int j : routes[i]) {
13                g.get(i).add(j);
14                max = Math.max(max, j);
15            }
16        }
17
18        // stop -> routes
19        HashMap<Integer, HashSet<Integer>> el = new HashMap<>();
20        for (int i = 0; i <= max; i++) {
21            el.put(i, new HashSet<>());
22        }
23
24        for (int i = 0; i < routes.length; i++) {
25            for (int j : routes[i]) {
26                el.get(j).add(i);
27            }
28        }
29
30        if (!el.containsKey(source) || !el.containsKey(target) ||
31            el.get(source).isEmpty() || el.get(target).isEmpty()) {
32            return -1;
33        }
34
35        // ✅ ADD THIS
36        boolean[] visitedRoute = new boolean[routes.length];
37
38        Queue<int[]> q = new LinkedList<>();
39        // state: {route, buses}
40
41        for (int i : el.get(source)) {
42            q.add(new int[]{i, 1});
43            visitedRoute[i] = true;
44        }
45
46        while (!q.isEmpty()) {
47            int[] p = q.poll();
48            int route = p[0];
49            int buses = p[1];
50
51            for (int stop : g.get(route)) {
52
53                if (stop == target) return buses;
54
55                for (int nextRoute : el.get(stop)) {
56                    if (!visitedRoute[nextRoute]) {
57                        visitedRoute[nextRoute] = true;
58                        q.add(new int[]{nextRoute, buses + 1});
59                    }
60                }
61            }
62        }
63
64        return -1;
65    }
66}
67