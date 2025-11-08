// Last updated: 11/8/2025, 8:31:50 PM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        
        for(int i=0; i<nums.length; i++){
            int c=0;
            for(int j=i; j<nums.length; j++){
                if(nums[j]==target){
                    c++;
                }
                int l = j-i+1;
                if(c>0 && c>(l-c)){
                    //System.out.println(i+" "+j);
                    ans++;
                }
                else if(c==l){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}