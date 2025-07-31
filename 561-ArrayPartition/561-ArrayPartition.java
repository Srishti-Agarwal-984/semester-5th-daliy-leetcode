// Last updated: 7/31/2025, 5:33:50 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i=i+2){
            sum=sum+nums[i];
        }
        return sum;
        
    }
}