// Last updated: 11/8/2025, 8:19:55 PM
class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int p=0;
        for(int i=0; i<nums.length; i++){
            p+=nums[nums.length-1]-nums[i];
        }
        return p;
        
    }
}