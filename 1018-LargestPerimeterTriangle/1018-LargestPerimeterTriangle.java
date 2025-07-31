// Last updated: 7/31/2025, 5:32:25 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]+nums[i+1]<=nums[i+2]){
                continue;
            }
            else{
                sum = Math.max(nums[i]+nums[i+1]+nums[i+2], sum);
            }
        }
        return sum;
        
    }
}