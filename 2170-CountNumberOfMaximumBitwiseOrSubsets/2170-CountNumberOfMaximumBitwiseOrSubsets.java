// Last updated: 7/31/2025, 5:29:40 PM
class Solution {
    static int count=0;
    public int countMaxOrSubsets(int[] nums) {
        int a=0;
        for(int i=0; i<nums.length; i++){
            a=a|nums[i];
        }
        comb(nums, 0, a,0);
        int g=count;
        count=0;
        return g;
        
    }
    public static void comb(int[] nums, int idx, int target, int ans){
        //int u=0;
        if(target==ans){
            count++;
        }
        if(idx==nums.length){
            return;
        }
        int u=0;
        for(int i=idx; i<nums.length; i++){
            comb(nums,i+1, target, ans|nums[i]);
        }
        //return u;
    }
}