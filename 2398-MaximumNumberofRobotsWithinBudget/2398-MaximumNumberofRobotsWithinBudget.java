// Last updated: 12/29/2025, 5:22:07 PM
1class Solution {
2    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
3        int n = runningCosts.length;
4
5        long[] prefix = new long[n];
6        prefix[0] = runningCosts[0];
7        for (int i = 1; i < n; i++) {
8            prefix[i] = prefix[i - 1] + runningCosts[i];
9        }
10
11        int lo = 0, hi = n, ans = 0;
12        while (lo <= hi) {
13            int mid = lo + (hi - lo) / 2;
14            if (helper(mid, prefix, chargeTimes, runningCosts, budget)) {
15                ans = mid;
16                lo = mid + 1;
17            } else {
18                hi = mid - 1;
19            }
20        }
21        return ans;
22    }
23
24    public boolean helper(int k, long[] prefix, int[] chargeTimes, int[] runningCosts, long budget) {
25        if (k == 0) return true;
26
27        PriorityQueue<Pair> pq = new PriorityQueue<>(
28            (a, b) -> b.val - a.val   // max heap
29        );
30
31        // first window
32        for (int i = 0; i < k; i++) {
33            pq.add(new Pair(chargeTimes[i], i));
34        }
35
36        long sum = prefix[k - 1];
37        if (pq.peek().val + k * sum <= budget) return true;
38
39        for (int j = k; j < chargeTimes.length; j++) {
40            pq.add(new Pair(chargeTimes[j], j));
41
42            // remove out-of-window elements
43            while (pq.peek().idx < j - k + 1) {
44                pq.poll();
45            }
46
47            sum = prefix[j] - prefix[j - k];
48
49            if (pq.peek().val + k * sum <= budget) {
50                return true;
51            }
52        }
53        return false;
54    }
55
56    class Pair {
57        int val, idx;
58        Pair(int v, int i) {
59            val = v;
60            idx = i;
61        }
62    }
63}
64