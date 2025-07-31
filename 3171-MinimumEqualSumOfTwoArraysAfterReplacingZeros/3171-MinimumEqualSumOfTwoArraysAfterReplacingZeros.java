// Last updated: 7/31/2025, 5:27:46 PM
class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int c=0;
        int k=0;
        long sum=0, l=0;
        for(int i=0; i<nums1.length; i++){
            sum+=nums1[i];
            if(nums1[i]==0){
                c++;

            }
        }
        for(int i=0; i<nums2.length; i++){
            l+=nums2[i];
            if(nums2[i]==0){
                k++;

            }
        }
        long min1 = sum + c;
        long min2 = l + k;

        if(k == 0 && c == 0){
            return sum == l ? sum : -1;
        }else if(c == 0){
            return l + k <=sum ?sum : -1;
        }else if (k == 0){
            return sum + c <= l ? l : -1;
        }
        return Math.max(min1, min2);



        
    }
}