// Last updated: 7/31/2025, 5:36:21 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int c=0;
        if(nums.length==1){
            c=0;
        }
        else if(nums.length==2){
            if(nums[0]>nums[1]){
                c=0;
            }
            else{
                c=1;
            }
        }
        else{
            for(int i=1; i<nums.length; i++){
                if(i!=nums.length-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                    c=i;
                    break;
                }
                if(i== nums.length-1 && nums[i]>nums[i-1]){
                    c=i;
                }
            }
        }
        return c;
    }
}