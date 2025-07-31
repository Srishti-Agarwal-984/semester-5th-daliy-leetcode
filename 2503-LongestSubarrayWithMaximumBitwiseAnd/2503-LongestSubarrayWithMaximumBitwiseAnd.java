// Last updated: 7/31/2025, 5:28:35 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int r=0;
        for(int i=0; i<nums.length; i++){
            r = Math.max(r, nums[i]);
        }
        int c=0;
        int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==r){
                c++;
            }
            else{
                ans=Math.max(ans,c);
                c=0;
            }
        }
        ans=Math.max(ans,c);
        return ans;
    }
}