# Last updated: 7/31/2025, 5:25:58 PM
from typing import List

class Solution:
    def canPartitionGrid(self, grid: List[List[int]]) -> bool:
        m, n = len(grid), len(grid[0])

        # Compute total sum of the grid
        total_sum = sum(sum(row) for row in grid)

        # If total sum is odd, it can't be split equally
        if total_sum % 2 != 0:
            return False

        half_sum = total_sum // 2

        # Check for horizontal cut
        row_sum = 0
        for i in range(m - 1):  # Only up to second last row
            row_sum += sum(grid[i])
            if row_sum == half_sum:
                return True

        # Precompute column sums
        col_sums = [0] * n
        for i in range(m):
            for j in range(n):
                col_sums[j] += grid[i][j]

        # Check for vertical cut
        col_prefix = 0
        for j in range(n - 1):  # Only up to second last column
            col_prefix += col_sums[j]
            if col_prefix == half_sum:
                return True

        return False
        