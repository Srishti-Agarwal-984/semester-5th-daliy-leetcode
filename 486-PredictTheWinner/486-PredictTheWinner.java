// Last updated: 7/31/2025, 5:34:12 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        boolean gh = helper(nums, 0, nums.length-1, 0, true)>=0;
        return gh;
    }
    public int helper(int[]  nums, int si, int en, int sum, boolean turn){
        if(si>en){
            return sum;
        }
        if(turn){
            int start =   helper(nums, si+1, en, sum+nums[si], false);
            int end =  helper(nums, si, en-1, sum+nums[en], false);
            return Math.max(start, end);
        }
        else{
            int start =   helper(nums, si+1, en, sum-nums[si], true);
            int end =  helper(nums, si, en-1, sum-nums[en], true);
            return Math.min(start, end);

        }
    }
}