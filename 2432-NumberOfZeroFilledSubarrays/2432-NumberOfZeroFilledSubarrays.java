// Last updated: 7/31/2025, 5:28:52 PM
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