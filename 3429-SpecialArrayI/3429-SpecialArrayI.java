// Last updated: 7/31/2025, 5:27:21 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean x=true;
        if(nums.length==1){
            x=true;
        }
        else{
            for(int i=0; i<nums.length-1; i++){
                if(nums[i]%2==0 && nums[i+1]%2==0){
                    x=false;
                    break;
                }
                if(nums[i]%2!=0 && nums[i+1]%2!=0){
                    x=false;
                    break;
                }
                
            }
        }
        return x;
        
    }
}