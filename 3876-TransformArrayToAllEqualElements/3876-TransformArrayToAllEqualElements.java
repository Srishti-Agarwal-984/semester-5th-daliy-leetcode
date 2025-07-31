// Last updated: 7/31/2025, 5:25:50 PM
class Solution {
    public boolean canMakeEqual(int[] num, int k) {
        int n = num.length;
        
        // Try making all elements -1
        int[] nums1 = num.clone();
        int c1 = 0;
        boolean ok1 = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums1[i] != -1) {
                nums1[i] *= -1;
                nums1[i + 1] *= -1;
                c1++;
            }
        }
        if (nums1[n - 1] != -1 || c1 > k) {
            ok1 = false;
        }

        // Try making all elements 1
        int[] nums2 = num.clone();
        int c2 = 0;
        boolean ok2 = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums2[i] != 1) {
                nums2[i] *= -1;
                nums2[i + 1] *= -1;
                c2++;
            }
        }
        if (nums2[n - 1] != 1 || c2 > k) {
            ok2 = false;
        }

        return ok1 || ok2;
    }
}