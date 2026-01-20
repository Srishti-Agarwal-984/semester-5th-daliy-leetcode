// Last updated: 1/20/2026, 11:49:01 PM
1class Solution {
2    public int[] getOrder(int[][] tasks) {
3        int n = tasks.length;
4        int[][] p = new int[n][3];
5
6        // p[i] = {enqueueTime, processingTime, index}
7        for (int i = 0; i < n; i++) {
8            p[i][0] = tasks[i][0];
9            p[i][1] = tasks[i][1];
10            p[i][2] = i;
11        }
12
13        // sort by enqueue time
14        Arrays.sort(p, (a, b) -> a[0] - b[0]);
15
16        // min-heap by processing time, then index
17        PriorityQueue<int[]> pq = new PriorityQueue<>(
18            (a, b) -> a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]
19        );
20
21        int time = 0, i = 0, idx = 0;
22        int[] ans = new int[n];
23
24        while (i < n || !pq.isEmpty()) {
25
26            // if no task available, jump time
27            if (pq.isEmpty() && time < p[i][0]) {
28                time = p[i][0];
29            }
30
31            // add all available tasks
32            while (i < n && p[i][0] <= time) {
33                pq.add(p[i]);
34                i++;
35            }
36
37            // process shortest job
38            int[] cur = pq.poll();
39            time += cur[1];
40            ans[idx++] = cur[2];
41        }
42
43        return ans;
44    }
45}
46