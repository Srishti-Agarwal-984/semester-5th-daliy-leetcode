// Last updated: 7/31/2025, 5:26:14 PM
class Solution {
    public long maximumProduct(int[] nums, int m) {
        long maxProduct =1L* nums[0]*nums[m-1];
        long ma = nums[0];
        long mi = nums[0];

        for (int i = m-1; i <nums.length; i++) {
            ma = Math.max(ma, nums[i-m+1]);
            mi = Math.min(mi, nums[i-m+1]);

            maxProduct = Math.max(maxProduct, ma*nums[i]);
            maxProduct = Math.max(maxProduct, mi*nums[i]);

        }

        return maxProduct;
    }
}
