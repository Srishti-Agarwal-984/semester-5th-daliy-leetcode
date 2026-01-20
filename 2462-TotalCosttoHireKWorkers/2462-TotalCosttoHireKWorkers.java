// Last updated: 1/20/2026, 1:13:33 PM
1class Solution {
2    public long totalCost(int[] costs, int k, int candidates) {
3
4        PriorityQueue<Pair> pq1 =
5            new PriorityQueue<>((a, b) -> a.cost != b.cost ? a.cost - b.cost : a.id - b.id);
6        PriorityQueue<Pair> pq2 =
7            new PriorityQueue<>((a, b) -> a.cost != b.cost ? a.cost - b.cost : a.id - b.id);
8
9        int n = costs.length;
10
11        // left candidates
12        int i = 0;
13        for (; i < candidates && i < n; i++) {
14            pq1.add(new Pair(costs[i], i));   // FIX
15        }
16
17        // right candidates
18        int j = n - 1;
19        for (; j >= n - candidates && j >= i; j--) {
20            pq2.add(new Pair(costs[j], j));
21        }
22
23        boolean[] arr = new boolean[n];
24        long sum = 0;
25
26        while (k > 0) {
27
28            if (pq2.isEmpty() ||
29               (!pq1.isEmpty() && pq1.peek().cost <= pq2.peek().cost)) {
30
31                Pair p = pq1.poll();          // FIX
32                sum += p.cost;
33                arr[p.id] = true;
34
35                if (i <= j) {
36                    pq1.add(new Pair(costs[i], i));
37                    i++;
38                }
39
40            } else {
41
42                Pair p = pq2.poll();          // FIX
43                sum += p.cost;
44                arr[p.id] = true;
45
46                if (i <= j) {
47                    pq2.add(new Pair(costs[j], j));
48                    j--;
49                }
50            }
51            k--;
52        }
53
54        return sum;
55    }
56
57    class Pair {
58        int cost;
59        int id;
60        public Pair(int cost, int id) {
61            this.cost = cost;
62            this.id = id;
63        }
64    }
65}
66