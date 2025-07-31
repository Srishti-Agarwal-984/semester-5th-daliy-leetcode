// Last updated: 7/31/2025, 5:29:46 PM
class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int si=0;
        
        for(int i=1; i<nums.length; i++){
            if(nums[si]<nums[i] && i!=si){
                ans=Math.max(nums[i]-nums[si],ans);
            }
            else{
                si=i;
            }
        }
        return ans;
    }
}