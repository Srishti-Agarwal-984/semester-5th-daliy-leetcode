// Last updated: 1/8/2026, 8:29:36 AM
1class Solution {
2    public int minimumDeviation(int[] nums) {
3
4        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
5        int min = Integer.MAX_VALUE;
6
7        // Step 1: Make all numbers even
8        for (int x : nums) {
9            if (x % 2 == 1) x *= 2;
10            maxHeap.add(x);
11            min = Math.min(min, x);
12        }
13
14        int ans = Integer.MAX_VALUE;
15
16        // Step 2: Reduce maximum while possible
17        while (!maxHeap.isEmpty()) {
18            int max = maxHeap.poll();
19            ans = Math.min(ans, max - min);
20
21            if (max % 2 == 0) {
22                max /= 2;
23                min = Math.min(min, max);
24                maxHeap.add(max);
25            } else {
26                break;
27            }
28        }
29
30        return ans;
31    }
32}
33