// Last updated: 12/30/2025, 6:44:53 PM
1class Solution {
2    public int numSquarefulPerms(int[] nums) {
3        Arrays.sort(nums);
4        boolean[] used = new boolean[nums.length];
5        int ans = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8            if (i > 0 && nums[i] == nums[i - 1]) continue;
9            used[i] = true;
10            ans += helper(nums, used, nums[i], 1);
11            used[i] = false;
12        }
13        return ans;
14    }
15
16    public int helper(int[] nums, boolean[] used, int prev, int count) {
17        if (count == nums.length) {
18            return 1;
19        }
20
21        int ans = 0;
22        for (int i = 0; i < nums.length; i++) {
23            if (used[i]) continue;
24
25            // skip duplicates
26            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
27
28            int sum = prev + nums[i];
29            int k = (int) Math.sqrt(sum);
30            if (k * k == sum) {
31                used[i] = true;
32                ans += helper(nums, used, nums[i], count + 1);
33                used[i] = false;
34            }
35        }
36        return ans;
37    }
38}
39