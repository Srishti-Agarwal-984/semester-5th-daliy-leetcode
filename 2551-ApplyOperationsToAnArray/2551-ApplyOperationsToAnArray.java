// Last updated: 7/31/2025, 5:28:30 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] p= new int[nums.length];
        int l=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                p[l]=nums[i];
                l++;
            }
        }
        return p;
    }
}