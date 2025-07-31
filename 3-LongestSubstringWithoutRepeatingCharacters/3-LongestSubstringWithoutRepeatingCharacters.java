// Last updated: 7/31/2025, 5:38:53 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder a = new StringBuilder(); // To store current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If currentChar is already in a, remove characters up to the duplicate
            while (a.indexOf(String.valueOf(currentChar)) >= 0) {
                a.deleteCharAt(0);  // Remove the first character in the substring
            }

            a.append(currentChar);  // Add current character to the substring
            max = Math.max(max, a.length());  // Update max length
        }

        return max;
    }
}
