// Last updated: 7/31/2025, 5:38:21 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
        
    }
}