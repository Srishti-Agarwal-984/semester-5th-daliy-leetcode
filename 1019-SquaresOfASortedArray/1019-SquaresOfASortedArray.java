// Last updated: 7/31/2025, 5:32:24 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }
}