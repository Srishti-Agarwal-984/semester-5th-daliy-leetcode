// Last updated: 7/31/2025, 5:29:57 PM
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n= Math.min(nums1.length , nums2.length);
        int j=0;
        if(nums1[n-1]>nums2[0]){
            return 0;
        }
        int ans = 0,  i=0;
        while(i<n && j<nums2.length){
            if(nums1[i]<=nums2[j] && j>=i){
                ans=Math.max(j-i, ans);
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return ans;
    }
}