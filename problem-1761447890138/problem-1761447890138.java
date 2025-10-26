// Last updated: 10/26/2025, 8:34:50 AM
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=Math.abs( nums[i]);
        }
        Arrays.sort(nums);
        long diff=0;
        long ans=0;
        int q=nums.length/2;
        for(int i=0; i<q; i++){
            diff=diff+nums[i]*nums[i];
        }
        for(int i=q; i<nums.length; i++){
            ans=ans+nums[i]*nums[i];
        }
        return ans-diff;
        
    }
}