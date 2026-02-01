// Last updated: 2/1/2026, 7:07:27 PM
1class Solution {
2    int mod = 1000000007;
3
4    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
5        int n = nums1.length;
6        int[] sorted = nums1.clone();
7        Arrays.sort(sorted);
8
9        long sum = 0;
10        int maxGain = 0;
11
12        for (int i = 0; i < n; i++) {
13            int diff = Math.abs(nums1[i] - nums2[i]);
14            sum = (sum + diff) % mod;
15
16            int idx = Arrays.binarySearch(sorted, nums2[i]);
17            if (idx < 0) idx = -idx - 1;
18
19            if (idx < n)
20                maxGain = Math.max(maxGain, diff - Math.abs(sorted[idx] - nums2[i]));
21
22            if (idx > 0)
23                maxGain = Math.max(maxGain, diff - Math.abs(sorted[idx - 1] - nums2[i]));
24        }
25
26        return (int)((sum - maxGain + mod) % mod);
27    }
28}
29