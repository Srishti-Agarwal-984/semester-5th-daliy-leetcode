// Last updated: 1/9/2026, 8:26:04 AM
1
2class Solution {
3    // dp[i]: Can number i be formed?
4    static final int MAX_K = 4001;
5    boolean[] dp = new boolean[MAX_K];
6
7    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
8        // Sort nums so we can easily find how many elements are greater than x in O(1)
9        Arrays.sort(nums);
10        int n = nums.length;
11
12        // Initialize dp
13        Arrays.fill(dp, false);
14        dp[0] = true;
15
16        // Index for nums
17        int p = 0;
18
19        // Answer array
20        boolean[] ans = new boolean[n];
21
22        // Traverse each x
23        for (int i = 1; i <= n; i++) {
24            while (p < n && nums[p] < i) {
25                // Similar to knapsack with space optimization
26                for (int j = k; j >= nums[p]; j--) {
27                    dp[j] |= dp[j - nums[p]];
28                }
29                p++;
30            }
31
32            // Number of elements which are greater than i
33            int cnt = n - p;
34
35            // Multiple knapsacks
36            for (int j = 0; j <= cnt; j++) {
37                // Pick j knapsacks (each has weight of i)
38                int weight = i * j;
39
40                if (k < weight) break;
41
42                // We can form dp[k - weight], so we can form dp[k]
43                // by choosing j knapsacks (each has weight of i)
44                if (dp[k - weight]) {
45                    ans[i - 1] = true;
46                    break;
47                }
48            }
49        }
50
51        return ans;
52    }
53}