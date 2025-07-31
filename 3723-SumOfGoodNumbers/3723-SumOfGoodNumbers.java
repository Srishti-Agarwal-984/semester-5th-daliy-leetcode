// Last updated: 7/31/2025, 5:26:27 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            if((i+k)<nums.length && (i-k)>=0 && nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                sum=sum+nums[i];
            }
            else if((i+k)>=nums.length && i-k<0){
                sum=sum+nums[i];
            }
            else if((i+k)<nums.length && (i-k)<0 && nums[i]>nums[i+k]){
                sum=sum+nums[i];
            }
            else if((i+k)>=nums.length && (i-k)>=0 && nums[i]>nums[i-k]){
                sum=sum+nums[i];
            }
            else{
                continue;
            }
        }
        return sum;
        
    }
}