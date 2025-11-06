// Last updated: 11/6/2025, 4:47:14 PM
class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        Integer[][] memo = new Integer[n + 1][shelfWidth + 1];
        return helper(books, shelfWidth, 0, 0, 0, memo);
    }

    private int helper(int[][] books, int shelfWidth, int i, int currWidth, int currHeight, Integer[][] memo) {
        if (i == books.length)
            return currHeight;

        if (memo[i][currWidth] != null)
            return memo[i][currWidth];

        int width = books[i][0];
        int height = books[i][1];

        // Option 1: put on same shelf (if fits)
        int sameShelf = Integer.MAX_VALUE;
        if (currWidth + width <= shelfWidth) {
            sameShelf = helper(books, shelfWidth, i + 1, currWidth + width, Math.max(currHeight, height), memo);
        }

        // Option 2: start new shelf
        int newShelf = currHeight + helper(books, shelfWidth, i + 1, width, height, memo);

        return memo[i][currWidth] = Math.min(sameShelf, newShelf);
    }
}