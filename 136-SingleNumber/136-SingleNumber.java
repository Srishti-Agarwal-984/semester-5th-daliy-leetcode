// Last updated: 7/31/2025, 5:36:39 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}