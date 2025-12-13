// Last updated: 12/13/2025, 6:51:39 AM
class Solution {
    public int minSwaps(String s) {
        int stack = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') stack++;
            else if (stack > 0) stack--;
        }
        return (stack + 1) / 2;
    }
}