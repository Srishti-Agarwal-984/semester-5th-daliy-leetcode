// Last updated: 12/19/2025, 3:24:32 PM
1class Solution {
2    public int[] findMode(TreeNode root) {
3        List<Integer> li = new ArrayList<>();
4        helper(root, li);
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7        int maxFreq = 0;
8
9        for (int i : li) {
10            map.put(i, map.getOrDefault(i, 0) + 1);
11            maxFreq = Math.max(maxFreq, map.get(i));
12        }
13
14        li = new ArrayList<>();
15        for (int k : map.keySet()) {
16            if (map.get(k) == maxFreq) {
17                li.add(k);
18            }
19        }
20
21        int[] ans = new int[li.size()];
22        for (int i = 0; i < li.size(); i++) {
23            ans[i] = li.get(i);
24        }
25        return ans;
26    }
27
28    public void helper(TreeNode root, List<Integer> li) {
29        if (root == null) return;
30
31        helper(root.left, li);
32        li.add(root.val);
33        helper(root.right, li);
34    }
35}
36