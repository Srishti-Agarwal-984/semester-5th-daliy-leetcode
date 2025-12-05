// Last updated: 12/5/2025, 1:28:23 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int left = 0, right = n - 1;
5
6        // Remove leading L cars (they never collide)
7        while (left < n && directions.charAt(left) == 'L') {
8            left++;
9        }
10
11        // Remove trailing R cars (they never collide)
12        while (right >= 0 && directions.charAt(right) == 'R') {
13            right--;
14        }
15
16        int ans = 0;
17        for (int i = left; i <= right; i++) {
18            char c = directions.charAt(i);
19            if (c != 'S') ans++;  // every R or L becomes S after collision
20        }
21        return ans;
22    }
23}
24