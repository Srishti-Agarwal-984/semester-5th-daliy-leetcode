// Last updated: 7/31/2025, 5:26:00 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        long hj =0;
        for(int i=0; i<nums.length; i++){
            hj+=nums[i];
        }
        hj=hj%k;
        return (int)(hj);
        
    }
}