// Last updated: 10/5/2025, 7:53:38 PM
class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int ans=0;
        for(int i=0; i<nums.length-pattern.length; i++){
            int r=pattern.length;
            int si=i;
            int c=0;
            int p=0;
            while(si<i+r){
                if(pattern[p]==0 && nums[si]==nums[si+1]){
                    si++;
                    p++;
                    continue;
                }
                if(pattern[p]==1 && nums[si]<nums[si+1]){
                    si++;
                    p++;
                    continue;
                }
                if(pattern[p]==-1 && nums[si]>nums[si+1]){
                    si++;
                    p++;
                    continue;
                }
                c=1;
                break;

            }
            if(c==0){
                ans++;
            }
        }
        return ans;
        
    }
}