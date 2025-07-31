// Last updated: 7/31/2025, 5:32:35 PM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums, goal-1);
    }
    public int helper(int[] nums, int target){
        int si=0, i=0;
        int ans=0;
        int sum=0;
        while(i<nums.length){
            sum+=nums[i];
            while(sum>target && si<=i){
                sum-=nums[si];
                si++;
            }
            ans+=i-si+1;
            i++;

        }
        return ans;
    }

}