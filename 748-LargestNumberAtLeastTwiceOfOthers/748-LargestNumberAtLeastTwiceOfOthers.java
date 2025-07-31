// Last updated: 7/31/2025, 5:33:12 PM
class Solution {
    public int dominantIndex(int[] nums) {
        int m=0, k=-1;
        int b=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=m){
                m=nums[i];
                k=i;
            }
            
        }
        for(int i=0; i<nums.length; i++){
            int u = nums[i]*2;
            if(m>=u && i!=k){
                b++;
            }
            
        }
        if(b!=nums.length-1){
            return -1;
        }
        return k;
        
    }
}