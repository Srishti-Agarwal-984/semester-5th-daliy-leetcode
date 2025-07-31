// Last updated: 7/31/2025, 5:33:07 PM
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        // if(nums.length<=2){
        //     return true;
        // }
        for(int i=0; i<nums.length; i++){
            // int u=i+2, l = nums.length-1;
            // while(u<=l){
            //     if(nums[i]>nums[u]|| nums[i]>nums[l]){
            //         return false;
            //     }
            //     u++;
            //     l--;
            // }
            if(nums[i]-i>=2 || nums[i]-i<=-2){
                return false;
            }
            
        }
        return true;
        
    }
}