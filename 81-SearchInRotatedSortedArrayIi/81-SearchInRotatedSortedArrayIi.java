// Last updated: 7/31/2025, 5:37:26 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length-1, i=0;
        while(i<=n){
            if(nums[i]==target){
                return true;
            }
            i++;
        }
        return false;
        
    }
}