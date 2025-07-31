// Last updated: 7/31/2025, 5:25:43 PM
class Solution {
    public String generateTag(String caption) {
        String result = "#";
        int newWordFlag = 0;

        for (int i = 0; i < caption.length(); i++) {
            char currentChar = caption.charAt(i);

            if (newWordFlag == 0 && currentChar != ' ') {
                newWordFlag = 1;

                if (result.length() == 1) {
                    // First character of the first word (should be lowercase)
                    if (currentChar >= 'A' && currentChar <= 'Z') {
                        currentChar = (char)(currentChar - 'A' + 'a');
                    }
                    result += currentChar;
                } else {
                    // First character of subsequent words (should be uppercase)
                    if (currentChar >= 'a' && currentChar <= 'z') {
                        currentChar = (char)(currentChar - 'a' + 'A');
                    }
                    result += currentChar;
                }

            } else if (currentChar == ' ') {
                newWordFlag = 0;
            } else {
                // Middle of a word (should be lowercase)
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    currentChar = (char)(currentChar - 'A' + 'a');
                }
                result += currentChar;
            }
        }

        if (result.length() <= 100) {
            return result;
        }

        return result.substring(0, 100);
    }
}
