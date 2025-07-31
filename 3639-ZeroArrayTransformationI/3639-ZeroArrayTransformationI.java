// Last updated: 7/31/2025, 5:26:37 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] psum = new int[nums.length];
        int[] diff = new int[nums.length+1];
        for(int i=0; i<queries.length; i++){
            diff[queries[i][0]]+=1;
            if(queries[i][1]+1<nums.length){
                diff[queries[i][1]+1]-=1;
            }
        }
        int cur=0;
        for(int i=0; i<nums.length; i++){
            cur+=diff[i];
            psum[i]+=cur;

        }
        for(int i=0; i<nums.length; i++){
            if(psum[i]<nums[i]){
                return false;
            }
        }
        return true;
        
    }
}