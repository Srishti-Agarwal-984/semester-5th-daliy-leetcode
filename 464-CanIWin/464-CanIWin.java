// Last updated: 12/25/2025, 8:26:41 AM
1class Solution {
2    Map<Integer, Boolean> dp = new HashMap<>();
3
4    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
5
6        // quick pruning
7        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
8        if (sum < desiredTotal) return false;
9        if (desiredTotal <= 0) return true;
10
11        return helper(maxChoosableInteger, desiredTotal, 0);
12    }
13
14    private boolean helper(int max, int total, int mask) {
15
16        if (dp.containsKey(mask)) return dp.get(mask);
17
18        for (int i = 1; i <= max; i++) {
19            int bit = 1 << i;
20
21            if ((mask & bit) == 0) { // number i not used
22                if (i >= total || !helper(max, total - i, mask | bit)) {
23                    dp.put(mask, true);
24                    return true;
25                }
26            }
27        }
28
29        dp.put(mask, false);
30        return false;
31    }
32}
33