// Last updated: 7/31/2025, 5:26:54 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0, m=0;
        for(int i=0; i<nums.length; i=i+1){
            if(nums[i]<=9){
                s=s+nums[i];
            }
            else{
                m=m+nums[i];
            }
        }
        if(s!=m){
            return true;
        }
        else{
            return false;
        }
        
    }
}