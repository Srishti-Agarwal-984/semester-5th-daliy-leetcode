// Last updated: 12/21/2025, 5:11:53 PM
1class Solution {
2
3    int n;
4    Integer[][] dp;
5
6    public int numSquarefulPerms(int[] nums) {
7        Arrays.sort(nums);
8        n = nums.length;
9
10        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
11        for (int i = 0; i < n; i++) map.put(i, new HashSet<>());
12
13        // build graph
14        for (int i = 0; i < n; i++) {
15            for (int j = i + 1; j < n; j++) {
16                int s = nums[i] + nums[j];
17                int r = (int) Math.sqrt(s);
18                if (r * r == s) {
19                    map.get(i).add(j);
20                    map.get(j).add(i);
21                }
22            }
23        }
24
25        dp = new Integer[1 << n][n];
26        int ans = 0;
27
28        for (int i = 0; i < n; i++) {
29            if (i > 0 && nums[i] == nums[i - 1]) continue;
30
31            boolean[] used = new boolean[n];
32            used[i] = true;
33            ans += helper(map, nums, used, 1 << i, i);
34        }
35        return ans;
36    }
37
38    int helper(HashMap<Integer, HashSet<Integer>> map,
39               int[] nums,
40               boolean[] used,
41               int mask,
42               int prev) {
43
44        if (mask == (1 << n) - 1) return 1;
45
46        if (dp[mask][prev] != null) return dp[mask][prev];
47
48        int ans = 0;
49        for (int e : map.get(prev)) {
50            if (used[e]) continue;
51
52            // duplicate skip (VERY IMPORTANT)
53            if (e > 0 && nums[e] == nums[e - 1] && !used[e - 1]) continue;
54
55            used[e] = true;
56            ans += helper(map, nums, used, mask | (1 << e), e);
57            used[e] = false;
58        }
59        return dp[mask][prev] = ans;
60    }
61}
62