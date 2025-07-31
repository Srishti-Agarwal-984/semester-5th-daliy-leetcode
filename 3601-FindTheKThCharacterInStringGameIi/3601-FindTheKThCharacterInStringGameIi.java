// Last updated: 7/31/2025, 5:26:46 PM
class Solution {
    public char kthCharacter(long k, int[] operations) {
        int shiftCount = 0;
        double length =(Math.pow(2,operations.length));  // Total final length of the word
        // Traverse the operations in reverse
        for (int i = operations.length - 1; i >= 0; i--) {
            length /= 2; 

            if (k > length) {  // If k is in the second half
                if (operations[i] == 1) {
                    shiftCount++;  
                }
                k -= length; 
            }
        }

        // Apply all the shifts to 'a'
        return (char)((('a' - 'a' + shiftCount) % 26)+'a');
    }
}