// Last updated: 7/31/2025, 5:29:30 PM
class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int r=-1,l=-1;
        int min = 100000;
        int max = -100000;
        for(int i=0; i<nums.length; i++){
            if(min>nums[i]){
                min=nums[i];
                r=i;
            }
            if(max<nums[i]){
                max=nums[i];
                l=i;
            }
        }
        int rp= Math.max(l,r)-0+1;
        rp=Math.min(rp, nums.length-Math.min(l,r));
        int u = Math.min(l,r)-0+1+nums.length-Math.max(l,r);
        return Math.min(rp, u);


    }
}