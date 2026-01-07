// Last updated: 1/7/2026, 1:15:23 PM
1class Solution {
2    public int maximumAmount(int[][] coins) {
3        int[][][]  dp = new int[coins.length][coins[0].length][3];
4        for(int[][] p: dp){
5            for(int[] l: p){
6                Arrays.fill(l, Integer.MIN_VALUE);
7            }
8        }
9        return helper(0, 0, coins, 2, dp);
10    }
11
12    public int helper(int row, int col, int[][] coins, int c, int[][][]  dp) {
13
14        if (row >= coins.length || col >= coins[0].length) {
15            return Integer.MIN_VALUE / 2;
16        }
17
18        if (row == coins.length - 1 && col == coins[0].length - 1) {
19            if (coins[row][col] >= 0) return coins[row][col];
20            return (c > 0) ? 0 : coins[row][col];
21        }
22
23      //  String key = row + "*" + col + "*" + c;
24        if (dp[row][col][c]!=Integer.MIN_VALUE) {
25            return dp[row][col][c];
26        }
27
28        // Take the coin normally
29        int take = coins[row][col] +
30                Math.max(
31                        helper(row + 1, col, coins, c, dp),
32                        helper(row, col + 1, coins, c, dp)
33                );
34
35        int ans = take;
36
37        // Skip negative coin if skips left
38        if (coins[row][col] < 0 && c > 0) {
39            int skip =
40                    Math.max(
41                            helper(row + 1, col, coins, c - 1, dp),
42                            helper(row, col + 1, coins, c - 1, dp)
43                    );
44            ans = Math.max(ans, skip);
45        }
46
47        //dp.put(key, ans);
48        return dp[row][col][c]=ans;
49    }
50}
51