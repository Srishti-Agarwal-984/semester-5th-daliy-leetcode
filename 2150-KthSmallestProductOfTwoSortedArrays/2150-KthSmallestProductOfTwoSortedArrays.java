// Last updated: 7/31/2025, 5:29:41 PM
class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long lo = -10000000000L, hi = 10000000000L;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2; 
            if (count(nums1, nums2, mid) >= k) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo; 
    }

    private long count(int[] nums1, int[] nums2, long target) {
        long c = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                if (target >= 0) c += nums2.length;
            } else if (nums1[i] > 0) {
                int lo = 0, hi = nums2.length - 1;
                while (lo <= hi) {
                    int mid = lo + (hi - lo) / 2;
                    if ((long) nums1[i] * nums2[mid] <= target) { 
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                c += lo;
            } else {
                int lo = 0, hi = nums2.length - 1;
                while (lo <= hi) {
                    int mid = lo + (hi - lo) / 2;
                    if ((long) nums1[i] * nums2[mid] <= target) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }
                c += nums2.length - lo;
            }
        }
        return c;
    }
}
