// Last updated: 7/31/2025, 5:33:55 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=nums[nums.length-1];
        int u=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                u++;
            }
            else{
                if(u==0){
                    c=nums[i];
                    return c;
                }
                u=0;
            }
        }
        return c;

        
    }
}