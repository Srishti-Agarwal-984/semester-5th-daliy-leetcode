// Last updated: 10/26/2025, 12:46:43 AM
class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        long ans =0;
        long diff=Long.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            ans+=Math.abs(nums1[i]-nums2[i]);
            if(nums2[nums2.length-1]>=nums1[i] && nums2[i]>=nums2[nums2.length-1]){
                diff=0;
            }
            if(nums2[nums2.length-1]>=nums2[i] && nums1[i]>=nums2[nums2.length-1]){
                diff=0;
            }
            diff=Math.min(diff, Math.abs(nums1[i]-nums2[nums2.length-1]));
            diff=Math.min(diff, Math.abs(nums2[i]-nums2[nums2.length-1]));
        }
        ans=ans+1l;
        ans=ans+diff;
        return ans;

        
    }
}