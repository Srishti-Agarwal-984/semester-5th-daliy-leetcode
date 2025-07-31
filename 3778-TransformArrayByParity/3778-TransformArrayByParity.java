// Last updated: 7/31/2025, 5:26:11 PM
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]%2;
        }
        Arrays.sort(nums);
        return nums;
        
    }
}