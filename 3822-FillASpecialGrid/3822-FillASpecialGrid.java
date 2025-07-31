// Last updated: 7/31/2025, 5:26:05 PM
class Solution {
    public int[][] specialGrid(int N) {
        int size = 1 << N; // 2^N
        return buildGrid(size, 0);
    }

    private int[][] buildGrid(int size, int start) {
        if (size == 1) {
            return new int[][] { { start } };
        }

        int half = size / 2;
        int offset = half * half;

        // Build each quadrant recursively with the correct start offset
        int[][] topRight = buildGrid(half, start);
        int[][] bottomRight = buildGrid(half, start + offset);
        int[][] bottomLeft = buildGrid(half, start + 2 * offset);
        int[][] topLeft = buildGrid(half, start + 3 * offset);

        // Combine quadrants into a full grid
        int[][] grid = new int[size][size];
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                grid[i][j] = topLeft[i][j];
                grid[i][j + half] = topRight[i][j];
                grid[i + half][j + half] = bottomRight[i][j];
                grid[i + half][j] = bottomLeft[i][j];
            }
        }

        return grid;
    }
}