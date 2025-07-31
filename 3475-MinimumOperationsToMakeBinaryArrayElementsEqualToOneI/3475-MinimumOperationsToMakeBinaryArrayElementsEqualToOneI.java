// Last updated: 7/31/2025, 5:27:06 PM
class Solution {
    public int minOperations(int[] nums) {
        int c = 0; // Initialize the count of operations

        // Iterate over the array except for the last two elements
        for (int i = 0; i < nums.length - 2; i++) {
            // If the current element is 0, toggle the next two elements
            if (nums[i] == 0) {
                nums[i + 1] = toggle(nums[i + 1]);
                nums[i + 2] = toggle(nums[i + 2]);
                c++; // Increment the operation count
            }
        }

        // Ensure the last two elements are not 0
        int k = nums.length;
        if (nums[k - 1] == 0 || nums[k - 2] == 0) {
            return -1; // Return -1 if any of the last two elements is 0
        }

        return c; // Return the count of operations
    }

    // Method to toggle a bit: 0 -> 1, 1 -> 0
    private int toggle(int num) {
        return num == 0 ? 1 : 0;
    }
}
