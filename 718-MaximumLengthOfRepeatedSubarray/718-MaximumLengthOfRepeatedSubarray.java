// Last updated: 7/31/2025, 5:33:18 PM
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int p1 = 0;
        int res = 0;

        while (p1 < nums1.length) {
            int p2 = 0;
            while (p2 < nums2.length) {
                int c = 0;
                int i = p1, j = p2;

                while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
                    c++;
                    i++;
                    j++;
                }

                res = Math.max(c, res);
                p2++;
            }
            p1++;
        }

        return res;
    }
}
