// Last updated: 7/31/2025, 5:28:21 PM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j =0 , l= Integer.MAX_VALUE, g=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] ==nums2[j]){
                l = Math.min(l, nums1[i]);
                i++;
                g=1;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        if(g==0){
            return -1;
        }
    

        return l;
        
    }
}