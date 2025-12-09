// Last updated: 12/9/2025, 11:24:53 PM
1class Solution {
2    public int specialTriplets(int[] nums) {
3        int n = nums.length;
4        int mod = 1_000_000_007;
5        long result = 0;
6
7        Map<Integer, Integer> rightMap = new HashMap<>();
8        Map<Integer, Integer> leftMap = new HashMap<>();
9
10        // Build rightMap with full frequencies
11        for (int num : nums) {
12            rightMap.put(num, rightMap.getOrDefault(num, 0) + 1);
13        }
14
15        for (int j = 0; j < n; j++) {
16            int current = nums[j];
17            rightMap.put(current, rightMap.get(current) - 1);  // j is no longer in the right side
18
19            int target = current * 2;
20
21            int leftCount = leftMap.getOrDefault(target, 0);
22            int rightCount = rightMap.getOrDefault(target, 0);
23
24            result = (result + (long) leftCount * rightCount) % mod;
25
26            // Update leftMap for future iterations
27            leftMap.put(current, leftMap.getOrDefault(current, 0) + 1);
28        }
29
30        return (int) result;
31    }
32}
33