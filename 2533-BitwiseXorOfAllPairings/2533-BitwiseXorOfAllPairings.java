// Last updated: 7/31/2025, 5:28:31 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        if(nums1.length%2==0 && nums2.length%2==0){
            return 0;
        }
        if(nums1.length%2==0){
            int b = nums1[0];
            for(int i=1; i<nums1.length; i++){
                b=b^nums1[i];
                
            }
            return b;
        }
        if(nums2.length%2==0){
            int b = nums2[0];
            for(int i=1; i<nums2.length; i++){
                b=b^nums2[i];
                
            }
            return b;
        }
        int a = nums1[0]^nums2[0];
        for(int i=1; i<nums1.length; i++){
            a=a^nums1[i];
        }
        for(int i=1; i<nums2.length; i++){
            a=a^nums2[i];
        }


        return a;
        
    }
}