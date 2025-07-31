// Last updated: 7/31/2025, 5:27:14 PM
class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        var n = nums.length;
        long incr = 0, decr = 0, ops = 0;

        for (var i = 0; i < n; i++) {
            var diff = target[i] - nums[i];

            if (diff > 0) {
                if (incr < diff)
                    ops += diff - incr;
                incr = diff;
                decr = 0;
            } else if (diff < 0) {
                if (diff < decr)
                    ops += decr - diff;
                decr = diff;
                incr = 0;
            } else {
                incr = decr = 0;
            }
        }

        return ops;
    }
}