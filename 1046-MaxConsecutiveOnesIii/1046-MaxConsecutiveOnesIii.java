// Last updated: 7/31/2025, 5:32:15 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, ml=0, zc=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zc++;
            }
            while(zc>k){
                if(nums[l]==0){
                    zc--;
                }
                l++;   
            }
            ml = Math.max(ml, i-l+1);
        }
        return ml;


        
    }
}