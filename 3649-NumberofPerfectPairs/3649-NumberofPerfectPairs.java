// Last updated: 1/14/2026, 12:47:45 PM
1class Solution {
2    public long perfectPairs(int[] nums) {
3
4        for (int i = 0; i < nums.length; i++) {
5            nums[i] = Math.abs(nums[i]);
6        }
7
8        Arrays.sort(nums);
9
10        long ans = 0;
11        int si = 0;
12
13        for (int en = 0; en < nums.length; en++) {
14            while (si < en && nums[si] * 2 < nums[en]) {
15                si++;
16            }
17            ans += en - si;
18        }
19
20        return ans;
21    }
22}
23