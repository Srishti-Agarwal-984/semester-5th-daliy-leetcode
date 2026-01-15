// Last updated: 1/15/2026, 6:53:43 AM
1class Solution {
2    public int minimumVisitedCells(int[][] grid) {
3        int m = grid.length, n = grid[0].length;
4
5        PriorityQueue<int[]> pq =
6            new PriorityQueue<>((a, b) -> a[2] - b[2]);
7
8        TreeSet<Integer>[] row = new TreeSet[m];
9        TreeSet<Integer>[] col = new TreeSet[n];
10
11        for (int i = 0; i < m; i++) {
12            row[i] = new TreeSet<>();
13            for (int j = 0; j < n; j++) row[i].add(j);
14        }
15        for (int j = 0; j < n; j++) {
16            col[j] = new TreeSet<>();
17            for (int i = 0; i < m; i++) col[j].add(i);
18        }
19
20        pq.add(new int[]{0, 0, 1});
21        row[0].remove(0);
22        col[0].remove(0);
23
24        while (!pq.isEmpty()) {
25            int[] arr = pq.poll();
26            int r = arr[0], c = arr[1], step = arr[2];
27
28            if (r == m - 1 && c == n - 1) return step;
29
30            int jump = grid[r][c];
31
32            // move down
33            Integer nr = col[c].ceiling(r + 1);
34            while (nr != null && nr <= r + jump) {
35                pq.add(new int[]{nr, c, step + 1});
36                col[c].remove(nr);
37                row[nr].remove(c);
38                nr = col[c].ceiling(r + 1);
39            }
40
41            // move right
42            Integer nc = row[r].ceiling(c + 1);
43            while (nc != null && nc <= c + jump) {
44                pq.add(new int[]{r, nc, step + 1});
45                row[r].remove(nc);
46                col[nc].remove(r);
47                nc = row[r].ceiling(c + 1);
48            }
49        }
50        return -1;
51    }
52}
53