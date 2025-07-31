// Last updated: 7/31/2025, 5:34:44 PM
class Solution {
    public static int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        long start = 1;

        // Find the range where the nth digit is located
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Find the exact number in the range
        long num = start + (n - 1) / digitLength;

        // Find the digit within that number
        String numStr = Long.toString(num);
        return Character.getNumericValue(numStr.charAt((n - 1) % digitLength));
    }

}