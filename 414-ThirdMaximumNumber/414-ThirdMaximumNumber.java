// Last updated: 7/31/2025, 5:34:37 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // int u=nums[nums.length-1];
        int c=0;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i+1]>nums[i]){
                c++;
            }
            if(c==2){
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
        
    }
}