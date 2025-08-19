// Last updated: 8/19/2025, 2:19:02 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long s=0;
        long c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                c++;
                s+=c;
            }
            else{
                c=0;
            }
        }
        return s;
    }
}