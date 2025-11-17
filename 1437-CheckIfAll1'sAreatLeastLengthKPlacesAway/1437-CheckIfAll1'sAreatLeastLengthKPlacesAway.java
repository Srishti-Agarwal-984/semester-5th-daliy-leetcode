// Last updated: 11/17/2025, 1:41:35 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                if(prev!=-1 && (i-prev)<=k){
                    return false;
                }
                prev=i;
               // System.out.println(nums[i]+" "+prev);
            }
        }
        return true;
        
    }
}