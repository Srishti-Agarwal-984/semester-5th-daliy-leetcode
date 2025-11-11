// Last updated: 11/11/2025, 7:00:43 AM
class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int[][][] dp = new int[grid.length][grid[0].length][k+1];
        for(int[][] d: dp){
            for(int[] p: d){
                Arrays.fill(p, -1);
            }
        }
        int ans =  helper(grid, 0, 0, k, dp);
        return ans<0? -1: ans;
        
    }
    public int helper(int[][] grid, int row, int col, int k, int[][][] dp){
int n = grid.length, m = grid[0].length;

        // If out of bounds
        if (row >= n || col >= m) return -1000000;

        // If exceeded k
        if (k < 0) return -1000000;

        // If reached bottom-right cell
        if (row == n - 1 && col == m - 1) {
            if (grid[row][col] >= 1 && k == 0) return -1000000;
            return grid[row][col];
        }

        // Memoized result
        if (dp[row][col][k] != -1) return dp[row][col][k];

        int use = (grid[row][col] >= 1) ? 1 : 0;

        // Move Down
        int down = helper(grid, row + 1, col, k - use, dp);
        // Move Right
        int right = helper(grid, row, col + 1, k - use, dp);

        int ans = grid[row][col] + Math.max(down, right);
        dp[row][col][k] = ans;

        return ans;
        
            
            
        
        
    }
}