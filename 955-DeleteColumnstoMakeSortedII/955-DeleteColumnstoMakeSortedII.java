// Last updated: 12/21/2025, 9:26:01 AM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs.length;
4        int m = strs[0].length();
5        int res = 0;
6
7        // Keeps track of sorted adjacent pairs: true = already confirmed in order
8        boolean[] sorted = new boolean[n - 1];
9
10        for (int col = 0; col < m; col++) {
11            boolean needToDelete = false;
12
13            // Check if this column breaks lexicographic order
14            for (int row = 0; row < n - 1; row++) {
15                if (!sorted[row] && strs[row].charAt(col) > strs[row + 1].charAt(col)) {
16                    needToDelete = true;
17                    break;
18                }
19            }
20
21            if (needToDelete) {
22                res++; // We must delete this column
23                continue;
24            }
25
26            // Update sorted pairs based on current column
27            for (int row = 0; row < n - 1; row++) {
28                if (strs[row].charAt(col) < strs[row + 1].charAt(col)) {
29                    sorted[row] = true; // Confirm this pair is now sorted
30                }
31            }
32        }
33
34        return res;
35    }
36}