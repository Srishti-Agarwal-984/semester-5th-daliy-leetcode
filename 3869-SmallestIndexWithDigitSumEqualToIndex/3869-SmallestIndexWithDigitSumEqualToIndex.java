// Last updated: 7/31/2025, 5:25:54 PM
class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int r =0;
            while(nums[i]!=0){
                r=r+nums[i]%10;
                nums[i]/=10;
            }
            if(r==i){
                return i;
            }
        }
        return -1;
    }
}