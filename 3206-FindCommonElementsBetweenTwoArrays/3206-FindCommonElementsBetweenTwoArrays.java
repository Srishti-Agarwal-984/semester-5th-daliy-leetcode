// Last updated: 7/31/2025, 5:27:42 PM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int y=0,i=0,j=0,n=0;
        while(i<nums1.length){
            if(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    y=1;
                }
            }
            j=j+1;
            if(j==nums2.length){
                n=n+y;
                y=0;
                j=0;
                i=i+1;
            }
        }
        i=0;
        j=0;
        y=0;
        int m=0;
        while(i<nums2.length){
            if(j<nums1.length){
                if(nums2[i]==nums1[j]){
                    //System.out.println(nums2[i]);
                    y=1;
                }
            }
            j=j+1;
            if(j==nums1.length){
                m=m+y;
                y=0;
                j=0;
                i=i+1;
            }
        }
        int ar[]={n,m};
        return ar;
    }
}