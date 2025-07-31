// Last updated: 7/31/2025, 5:38:12 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] bn = new boolean[nums.length+2];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0 && nums[i]<=nums.length){
                bn[nums[i]]=true;
            }
        }
        int ans=0;
        for(int i=0; i<bn.length; i++){
            if(i!=0 && bn[i]==false){
                ans=i;
                break;
            }
        }
        // if(ans==0){
        //     ans = nums.length+1;
        // }
        return ans;
        
    }
}