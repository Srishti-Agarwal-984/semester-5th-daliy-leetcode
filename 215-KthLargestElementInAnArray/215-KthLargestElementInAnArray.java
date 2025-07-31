// Last updated: 7/31/2025, 5:35:52 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
        
        
    }
}