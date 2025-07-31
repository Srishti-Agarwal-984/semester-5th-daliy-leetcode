// Last updated: 7/31/2025, 5:36:23 PM
class Solution {
    public int findMin(int[] nums) {
        // 
        int y=5000;
        for(int i=0; i<nums.length; i++){
            y=Math.min(y, nums[i]);
        }
        return y;
        
    }
}