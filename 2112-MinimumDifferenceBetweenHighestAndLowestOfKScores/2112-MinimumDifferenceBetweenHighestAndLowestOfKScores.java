// Last updated: 7/31/2025, 5:29:49 PM
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum =nums[k-1]-nums[0];
        
        int n= nums.length;
        for(int i=0; i<=n-k; i++){
            sum = Math.min(nums[i+k-1]-nums[i], sum);
        }
        return sum;
        
        
    }
}