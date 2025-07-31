// Last updated: 7/31/2025, 5:34:11 PM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int c=comb(nums,0,target,0);
        return c;
    }
    public static int comb(int[] nums, int idx, int target, int ans){
        if(idx==nums.length && target == ans){
            return 1;
        }
        int p=0;
        // for(int i=idx; i<nums.length; i++){
        //     p=p+comb(nums,i+1, target, ans-nums[i]);
        //     p=p+comb(nums,i+1, target, ans+nums[i]);
        // }
        if(idx<nums.length){
            p=p+comb(nums,idx+1, target, ans-nums[idx]);
            p=p+comb(nums,idx+1, target, ans+nums[idx]);

        }
        // p=p+comb(nums,i+1, target, ans-nums[i]);
        //     p=p+comb(nums,i+1, target, ans+nums[i]);
        return p;
    }
}