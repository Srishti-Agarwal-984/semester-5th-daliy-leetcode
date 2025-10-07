// Last updated: 10/7/2025, 12:42:50 PM
class Solution {
    public long maximumTotalCost(int[] nums) {
        long pos = (long) -1e15; // very small → because first element cannot be added directly in pos state
        long neg = 0; // start from 0
        long tmp;
        for (int a : nums) {
            tmp = neg; // save previous neg
            neg = pos - a; // if we subtract a, previous must have ended in '+' → pos - a
            pos = Math.max(pos, tmp) + a; // if we add a, take max of continuing pos or starting fresh from previous neg

        }
        return Math.max(pos, neg);
    }
}