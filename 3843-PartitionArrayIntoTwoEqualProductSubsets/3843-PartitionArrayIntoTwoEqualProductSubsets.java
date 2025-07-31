// Last updated: 7/31/2025, 5:26:01 PM
class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n subsets

        for (int mask = 1; mask < totalSubsets - 1; mask++) {
            long prod1 = 1;
            long prod2 = 1;
            boolean valid1 = true;
            boolean valid2 = true;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    prod1 *= nums[i];
                    if (prod1 > target) valid1 = false; // prune large
                } else {
                    prod2 *= nums[i];
                    if (prod2 > target) valid2 = false;
                }
            }

            if (valid1 && valid2 && prod1 == target && prod2 == target) {
                return true;
            }
        }

        return false;
    }
}