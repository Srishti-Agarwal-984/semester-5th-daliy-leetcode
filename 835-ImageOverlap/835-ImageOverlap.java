// Last updated: 1/7/2026, 1:30:39 PM
1class Solution {
2    public int largestOverlap(int[][] img1, int[][] img2) {
3        int n = img1.length;
4
5        List<int[]> ones1 = new ArrayList<>();
6        List<int[]> ones2 = new ArrayList<>();
7
8        // Collect positions of 1s
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < n; j++) {
11                if (img1[i][j] == 1) ones1.add(new int[]{i, j});
12                if (img2[i][j] == 1) ones2.add(new int[]{i, j});
13            }
14        }
15
16        HashMap<String, Integer> map = new HashMap<>();
17        int ans = 0;
18
19        // Count translation vectors
20        for (int[] a : ones1) {
21            for (int[] b : ones2) {
22                int dx = b[0] - a[0];
23                int dy = b[1] - a[1];
24                String key = dx + "," + dy;
25
26                int count = map.getOrDefault(key, 0) + 1;
27                map.put(key, count);
28                ans = Math.max(ans, count);
29            }
30        }
31
32        return ans;
33    }
34}
35