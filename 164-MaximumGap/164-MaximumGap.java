// Last updated: 7/31/2025, 5:36:18 PM
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        
        int y =0;
        for(int i=0; i<nums.length-1; i++){
            y = Math.max(y, nums[i+1]-nums[i]);
        }
        return y;
        
    }
}