// Last updated: 1/12/2026, 3:10:40 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        if (nums.length == 1) return 0;
4
5        Map<Integer, Integer> even = new HashMap<>();
6        Map<Integer, Integer> odd = new HashMap<>();
7
8        // Count frequencies
9        for (int i = 0; i < nums.length; i++) {
10            if (i % 2 == 0)
11                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
12            else
13                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
14        }
15
16        // Get top two frequent elements
17        int[] e1 = {0, 0}, e2 = {0, 0}; // {value, freq}
18        int[] o1 = {0, 0}, o2 = {0, 0};
19
20        for (int key : even.keySet()) {
21            int f = even.get(key);
22            if (f > e1[1]) {
23                e2 = e1;
24                e1 = new int[]{key, f};
25            } else if (f > e2[1]) {
26                e2 = new int[]{key, f};
27            }
28        }
29
30        for (int key : odd.keySet()) {
31            int f = odd.get(key);
32            if (f > o1[1]) {
33                o2 = o1;
34                o1 = new int[]{key, f};
35            } else if (f > o2[1]) {
36                o2 = new int[]{key, f};
37            }
38        }
39
40        int n = nums.length;
41
42        // If most frequent values differ
43        if (e1[0] != o1[0]) {
44            return n - e1[1] - o1[1];
45        }
46
47        // Otherwise try second best
48        return Math.min(
49            n - e1[1] - o2[1],
50            n - e2[1] - o1[1]
51        );
52    }
53}
54