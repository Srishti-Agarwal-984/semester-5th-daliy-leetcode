// Last updated: 1/19/2026, 6:47:55 AM
1class Solution {
2
3  int rows, cols;
4
5  // Main function
6  public int maxSideLength(int[][] grid, int limit) {
7
8      rows = grid.length;
9      cols = grid[0].length;
10
11      // Prefix sum matrix
12      int[][] prefix = new int[rows + 1][cols + 1];
13
14      // Build prefix sums
15      for (int r = 1; r <= rows; r++) {
16          for (int c = 1; c <= cols; c++) {
17              prefix[r][c] =
18                      prefix[r - 1][c]
19                    + prefix[r][c - 1]
20                    - prefix[r - 1][c - 1]
21                    + grid[r - 1][c - 1];
22                //System.out.println(prefix[r][c]);
23          }
24      }
25
26      int left = 0;
27      int right = Math.min(rows, cols);
28      int answer = 0;
29
30      // Binary search on square size
31      while (left <= right) {
32          int size = left + (right - left) / 2;
33
34          if (existsValidSquare(prefix, size, limit)) {
35              answer = size;
36              left = size + 1;
37          } else {
38              right = size - 1;
39          }
40      }
41
42      return answer;
43  }
44
45  // Check if any square of given size satisfies threshold
46  private boolean existsValidSquare(int[][] prefix, int size, int limit) {
47
48      for (int r = size; r <= rows; r++) {
49          for (int c = size; c <= cols; c++) {
50
51              int squareSum =
52                      prefix[r][c]
53                    - prefix[r - size][c]
54                    - prefix[r][c - size]
55                    + prefix[r - size][c - size];
56                //System.out.println(squareSum);
57              if (squareSum <= limit) {
58                  return true;
59              }
60          }
61      }
62      return false;
63  }
64}