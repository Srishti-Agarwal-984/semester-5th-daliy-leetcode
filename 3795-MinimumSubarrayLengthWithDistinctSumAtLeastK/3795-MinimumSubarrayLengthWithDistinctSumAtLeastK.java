// Last updated: 1/11/2026, 2:18:58 PM
1class Solution {
2    public int minLength(int[] nums, int k) {
3        int len = nums.length;
4        int sum = 0, ans = len + 1;
5        int[] f = new int[100001];
6        int i = 0, j = 0;
7
8        while (i < len) {
9            while (i < len && sum < k) {
10                if (f[nums[i]] == 0) {
11                    sum += nums[i];
12                }
13                f[nums[i]]++;
14                i++;
15            }
16
17            while (sum >= k && j < i) {
18                ans = Math.min(ans, i - j);
19
20                int n = nums[j];
21                f[n]--;
22                if (f[n] == 0) {
23                    sum -= n;
24                }
25                j++;
26            }
27        }
28        return ans == len + 1 ? -1 : ans;
29    }
30}
31