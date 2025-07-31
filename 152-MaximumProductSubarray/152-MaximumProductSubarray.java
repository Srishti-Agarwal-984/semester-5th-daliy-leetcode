// Last updated: 7/31/2025, 5:36:25 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        int product = 1;
        for (int i=0; i<n; i++) {
            product *= nums[i];
            maxProduct = Math.max(product, maxProduct);
            if (product == 0)
                product = 1;
        }

        product = 1;
        for (int i=n-1; i>=0; i--) {
            product *= nums[i];
            maxProduct = Math.max(product, maxProduct);
            if (product == 0)
                product = 1;
        }
        return maxProduct;
    }
}