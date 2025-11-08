// Last updated: 11/8/2025, 6:04:05 PM
class Solution {
    public int minimumOneBitOperations(int n) {
        return helper(n);
    }

    private int helper(int n) {
        if (n == 0) return 0;
        int k = 31 - Integer.numberOfLeadingZeros(n); // highest bit index
        int mask = 1 << k;
        return (1 << (k + 1)) - 1 - helper(n ^ mask);
    }
}