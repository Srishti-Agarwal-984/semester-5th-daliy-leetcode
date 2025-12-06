// Last updated: 12/6/2025, 8:59:08 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int[] dp = new int[5001];
4        helper(dp);
5        int[] ans = new int[nums.length];
6        for(int i=0; i<nums.length; i++){
7            ans[i] = dp[nums[i]];
8        }
9        return ans;
10    }
11
12    public void helper(int[] dp){
13        List<Integer> li = new ArrayList<>();
14        for (int len = 1; len <= 13; len++) { 
15            int half = (len + 1) / 2;
16            int start = 1 << (half - 1);
17            int end = 1 << half;
18
19            for (int x = start; x < end; x++) {
20                int val = x;
21                int t = x;
22                if (len % 2 == 1) t >>= 1;
23
24                while (t > 0) {
25                    val = (val << 1) | (t & 1);
26                    t >>= 1;
27                }
28                if (val <= 5000) li.add(val);
29            }
30        }
31        Collections.sort(li);
32        for (int i = 1; i <= 5000; i++) {
33            int pos = Collections.binarySearch(li, i);
34
35            if (pos >= 0) {  
36                dp[i] = 0;     
37                continue;
38            }
39
40            pos = -(pos + 1);
41            int min = Integer.MAX_VALUE;
42
43            if (pos < li.size()) 
44                min = Math.min(min, li.get(pos) - i);
45            if (pos > 0) 
46                min = Math.min(min, i - li.get(pos - 1));
47
48            dp[i] = min;
49        }
50        // ************************************************************************
51    }
52}
53