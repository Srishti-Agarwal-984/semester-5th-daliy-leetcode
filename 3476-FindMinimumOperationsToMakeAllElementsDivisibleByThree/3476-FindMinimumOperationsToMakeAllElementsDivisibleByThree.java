// Last updated: 7/31/2025, 5:27:04 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i=i+1)
        {
            if (nums[i]%3 !=0){
                c=c+1;
            }
        }
        return c;
        
    }
}