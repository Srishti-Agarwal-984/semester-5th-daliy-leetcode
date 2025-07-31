// Last updated: 7/31/2025, 5:30:08 PM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int u = sum;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                sum=sum+nums[i];
            }
            else{
                u=Math.max(u,sum);
                sum=nums[i];
            }
        }
        u=Math.max(u,sum);
        return u;
        
    }
}