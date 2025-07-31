// Last updated: 7/31/2025, 5:32:28 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int res = 0;

        // Keeps track of sorted adjacent pairs: true = already confirmed in order
        boolean[] sorted = new boolean[n - 1];

        for (int col = 0; col < m; col++) {
            boolean needToDelete = false;

            // Check if this column breaks lexicographic order
            for (int row = 0; row < n - 1; row++) {
                if (!sorted[row] && strs[row].charAt(col) > strs[row + 1].charAt(col)) {
                    needToDelete = true;
                    break;
                }
            }

            if (needToDelete) {
                res++; // We must delete this column
                continue;
            }

            // Update sorted pairs based on current column
            for (int row = 0; row < n - 1; row++) {
                if (strs[row].charAt(col) < strs[row + 1].charAt(col)) {
                    sorted[row] = true; // Confirm this pair is now sorted
                }
            }
        }

        return res;
    }
}