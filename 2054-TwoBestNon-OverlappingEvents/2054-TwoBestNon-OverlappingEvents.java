// Last updated: 12/23/2025, 1:28:30 PM
1class Solution {
2    public class tuple {
3        int first;
4        int second;
5        int val;
6
7        public tuple(int first, int second, int val) {
8            this.first = first;
9            this.second = second;
10            this.val = val;
11        }
12    }
13
14    public int maxTwoEvents(int[][] events) {
15        int n = events.length;
16        tuple[] arr = new tuple[n];
17        for (int i = 0; i < n; i++) {
18            arr[i] = new tuple(events[i][0], events[i][1], events[i][2]);
19        }
20        Arrays.sort(arr, new Comparator<tuple>() {
21            @Override
22            public int compare(tuple o1, tuple o2) {
23                return o1.first - o2.first;
24            }
25        });
26
27        int[][] dp = new int[n][3];
28        for (int[] a : dp) {
29            Arrays.fill(a, -1);
30        }
31        return helper(arr, 0, 2, dp);
32    }
33    public int helper(tuple[] arr, int idx, int k, int[][] dp){
34        if (idx >= arr.length) {
35            return 0;
36        }
37        if (k == 0) {
38            return 0;
39        }
40        if (dp[idx][k] != -1) {
41            return dp[idx][k];
42        }
43
44        int notake = helper(arr, idx + 1, k, dp);
45        int next = nextidx(arr[idx].second, arr, idx + 1);
46        int take = arr[idx].val + helper(arr, next, k - 1, dp);
47        return dp[idx][k] = Math.max(take, notake);
48        
49    }
50    public int nextidx(int end, tuple[] arr, int idx) {
51        int l = idx, r = arr.length;
52        while (l < r) {
53            int mid = (l + r) / 2;
54            if (arr[mid].first > end)
55                r = mid;
56            else
57                l = mid + 1;
58        }
59        return l;
60    }
61}