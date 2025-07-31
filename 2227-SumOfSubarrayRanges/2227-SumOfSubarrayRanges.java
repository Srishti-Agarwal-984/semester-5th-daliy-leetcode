// Last updated: 7/31/2025, 5:29:26 PM
class Solution {
    public long subArrayRanges(int[] nums) {
        long h=0;
        for(int i=0; i<nums.length; i++){
            int max=nums[i], min= nums[i];
            for(int j=i; j<nums.length; j++){
                max=Math.max(max, nums[j]);
                min=Math.min(min, nums[j]);
                h+=max-min;
            }
        }
        return h;
    }
}