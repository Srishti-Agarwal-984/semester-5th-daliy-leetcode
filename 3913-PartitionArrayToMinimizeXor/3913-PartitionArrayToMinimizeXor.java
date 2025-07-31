// Last updated: 7/31/2025, 5:25:33 PM
class Solution {
    int[][] memo;
    public int minXor(int[] nums, int k) {
        int n = nums.length;
        memo = new int[n][k + 1];
        for (int[] row : memo) Arrays.fill(row, -1);
        return dfs(nums, 0, k);
    }

    private int dfs(int[] nums, int index, int partitionsLeft) {
        if (index == nums.length && partitionsLeft == 0) return 0;
        if (index == nums.length || partitionsLeft == 0) return Integer.MAX_VALUE;
        if (memo[index][partitionsLeft] != -1) return memo[index][partitionsLeft];

        int currentXor = 0;
        int minMaxXor = Integer.MAX_VALUE;

        for (int j = index; j < nums.length; j++) {
            currentXor ^= nums[j];
            int next = dfs(nums, j + 1, partitionsLeft - 1);
            if (next != Integer.MAX_VALUE)
                minMaxXor = Math.min(minMaxXor, Math.max(currentXor, next));
        }

        memo[index][partitionsLeft] = minMaxXor;
        return minMaxXor;
    }
}