// Last updated: 7/31/2025, 5:33:35 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int p = nums[0]*nums[1]*nums[2];
        int p2 = nums.length;
        int p3 = nums[p2-1]*nums[p2-2]*nums[p2-3];
        int p4 = nums[0]*nums[1]*nums[p2-1];
        p3=Math.max(p3,p);
        return Math.max(p3,p4);
        
    }
}