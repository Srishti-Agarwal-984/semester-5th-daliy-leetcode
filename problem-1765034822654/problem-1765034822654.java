// Last updated: 12/6/2025, 8:57:02 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        // Step 1: generate binary palindromes ≤ 5000
4        List<Integer> pals = generateBinaryPalindromes(5000);
5
6        // Step 2: precompute answers for all numbers
7        int[] dp = new int[5001];
8        for (int i = 1; i <= 5000; i++) {
9            dp[i] = findNearestPalindrome(i, pals);
10        }
11
12        // Step 3: create result for nums[]
13        int[] ans = new int[nums.length];
14        for (int i = 0; i < nums.length; i++) {
15            ans[i] = dp[nums[i]];
16        }
17        return ans;
18    }
19
20    // Generate binary palindromes up to maxVal
21    private List<Integer> generateBinaryPalindromes(int maxVal) {
22        List<Integer> res = new ArrayList<>();
23
24        // construct palindromes by mirroring halves
25        for (int len = 1; len <= 13; len++) { // because 2^13 > 5000
26            int half = (len + 1) / 2;
27            int start = 1 << (half - 1); // avoid leading zeros
28            int end = (1 << half);
29
30            for (int x = start; x < end; x++) {
31                int val = makePalindrome(x, len % 2 == 1);
32                if (val <= maxVal) res.add(val);
33            }
34        }
35
36        Collections.sort(res);
37        return res;
38    }
39
40    // Convert half to full binary palindrome
41    private int makePalindrome(int x, boolean oddLength) {
42        int res = x;
43        if (oddLength) x >>= 1;
44        while (x > 0) {
45            res = (res << 1) | (x & 1);
46            x >>= 1;
47        }
48        return res;
49    }
50
51    // Binary search for nearest palindrome
52    private int findNearestPalindrome(int target, List<Integer> pals) {
53        int pos = Collections.binarySearch(pals, target);
54        if (pos >= 0) return 0;
55
56        pos = -(pos + 1);
57        int diff = Integer.MAX_VALUE;
58
59        if (pos < pals.size()) diff = Math.min(diff, pals.get(pos) - target);
60        if (pos > 0) diff = Math.min(diff, target - pals.get(pos - 1));
61
62        return diff;
63    }
64}
65