// Last updated: 7/31/2025, 5:27:03 PM
class Solution {
    public int maximumLength(int[] nums) {
        int turn = nums[0]%2;
        int c=1;
        int z=0;
        if(turn==0){
            z=1;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]%2!=turn){
                c++;
                turn = nums[i]%2;
            }
            if(nums[i]%2==0){
                z++;
            }
        }
        c=Math.max(c,Math.max(z,(nums.length-z)));
        return c;
    }
}