// Last updated: 7/31/2025, 5:29:56 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int si=0, en=nums.length-1;
        int ans = 0;
        while(si<=en){
            ans = Math.max(nums[si]+nums[en], ans);
            si++;
            en--;
        }
        return ans;
    }
}