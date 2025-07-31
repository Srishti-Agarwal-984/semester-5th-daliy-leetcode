// Last updated: 7/31/2025, 5:32:32 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                c=c+nums[i]-nums[i+1]+1;
                nums[i+1]=nums[i]+1;
            }
        }
        return c;

        
    }
}