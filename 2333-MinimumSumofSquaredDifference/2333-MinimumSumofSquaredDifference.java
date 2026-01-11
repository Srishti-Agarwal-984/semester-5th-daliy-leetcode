// Last updated: 1/11/2026, 2:40:40 PM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int n = nums1.length;
4        long ops = (long) k1 + k2;
5
6        int max = 0;
7        int[] diff = new int[n];
8        for (int i = 0; i < n; i++) {
9            diff[i] = Math.abs(nums1[i] - nums2[i]);
10            max = Math.max(max, diff[i]);
11        }
12
13        long[] cnt = new long[max + 1];
14        for (int d : diff) cnt[d]++;
15
16        for (int d = max; d > 0 && ops > 0; d--) {
17            if (cnt[d] == 0) continue;
18
19            long canReduce = Math.min(cnt[d], ops);
20            cnt[d] -= canReduce;
21            cnt[d - 1] += canReduce;
22            ops -= canReduce;
23        }
24
25        long ans = 0;
26        for (int d = 0; d <= max; d++) {
27            ans += cnt[d] * (long) d * d;
28        }
29
30        return ans;
31    }
32}
33