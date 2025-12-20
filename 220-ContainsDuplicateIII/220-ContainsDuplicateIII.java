// Last updated: 12/20/2025, 7:54:11 AM
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
3
4        List<Integer> ab = new ArrayList<>();
5
6        for (int i = 0; i <= indexDiff && i < nums.length; i++) {
7            ab.add(nums[i]);
8        }
9
10        Collections.sort(ab);
11
12        for (int i = 0; i < ab.size() - 1; i++) {
13            if (Math.abs(ab.get(i + 1) - ab.get(i)) <= valueDiff) {
14                return true;
15            }
16        }
17
18        for (int i = indexDiff + 1; i < nums.length; i++) {
19
20            ab.remove(Integer.valueOf(nums[i - indexDiff - 1]));
21
22            int k = helper(ab, nums[i]);
23
24            ab.add(k, nums[i]);
25
26            if (k > 0 && Math.abs(ab.get(k) - ab.get(k - 1)) <= valueDiff) {
27                return true;
28            }
29
30            if (k < ab.size() - 1 && Math.abs(ab.get(k + 1) - ab.get(k)) <= valueDiff) {
31                return true;
32            }
33        }
34
35        return false;
36    }
37
38    public int helper(List<Integer> ab, int temp) {
39        int si = 0, en = ab.size();
40        while (si < en) {
41            int mid = si + (en - si) / 2;
42            if (ab.get(mid) >= temp) {
43                en = mid;
44            } else {
45                si = mid + 1;
46            }
47        }
48        return si;
49    }
50}
51