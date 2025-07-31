// Last updated: 7/31/2025, 5:26:36 PM
class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int cn=0;
        for(int i=0; i<nums.length-2; i++){
            int r = nums[i]+nums[i+2];
            if(nums[i+1]%2==0 && r==(nums[i+1]/2)){
                cn++;
            }
        }
        return cn;
    }
}