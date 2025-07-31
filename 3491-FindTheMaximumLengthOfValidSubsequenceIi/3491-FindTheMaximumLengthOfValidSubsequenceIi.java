// Last updated: 7/31/2025, 5:27:01 PM
class Solution {
    public int maximumLength(int[] nums, int k) {
        int res = 2;
        for (int j = 0; j < k; j++) {
            int[] dp = new int[k];

            for (int i = 0; i < nums.length; i++) {
                int mod = nums[i] % k;
                int pos = (j - mod + k) % k;
                dp[mod] = dp[pos] + 1;
                res = Math.max(res, dp[mod]);
            }

            
        }
        return res;
    }
}