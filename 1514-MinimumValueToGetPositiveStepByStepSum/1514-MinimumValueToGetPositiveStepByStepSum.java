// Last updated: 7/31/2025, 5:31:06 PM
class Solution {
    public int minStartValue(int[] nums) {
        int y=1;
        int p=1;
        for(int i=0; i<nums.length; i++){
            p=p-nums[i];
            y=Math.max(y,p);
        }
        return y;
        
    }
}