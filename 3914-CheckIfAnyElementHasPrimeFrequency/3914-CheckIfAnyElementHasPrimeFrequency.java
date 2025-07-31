// Last updated: 7/31/2025, 5:25:36 PM
class Solution {
    public boolean checkPrimeFrequency(int[] arr) {
        int[] freq = new int[101];
        boolean[] isComposite = new boolean[101];

        // Mark 0 and 1 as non-prime
        isComposite[0] = true;
        isComposite[1] = true;

        // Sieve of Eratosthenes to mark non-prime numbers
        for (int i = 2; i <= 100; i++) {
            if (isComposite[i]) continue;
            for (int j = 2; i * j <= 100; j++) {
                isComposite[i * j] = true;
            }
        }

        // Count frequency of each element in the array
        for (int num : arr) {
            freq[num]++;
        }

        // Check if any frequency is a prime number
        for (int i = 0; i <= 100; i++) {
            if (!isComposite[freq[i]]) {
                return true;
            }
        }

        return false;
    }
}
