// Last updated: 12/19/2025, 6:51:56 PM
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long reach = 0;   // 1 se reach tak cover ho raha hai
4        int i = 0;
5        int patches = 0;
6
7        while (reach < n) {
8            if (i < nums.length && nums[i] <= reach + 1) {
9                // array ka element use kar sakte hain
10                reach += nums[i];
11                i++;
12            } else {
13                // patch add karo
14                long patch = reach + 1;
15                reach += patch;
16                patches++;
17            }
18        }
19        return patches;
20
21    }
22}