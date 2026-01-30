// Last updated: 1/30/2026, 3:03:58 PM
1class Solution {
2    HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
3
4    public int amountOfTime(TreeNode root, int start) {
5
6        // initialize graph
7        for (int i = 1; i <= 100000; i++) {
8            map.put(i, new HashSet<>());
9        }
10
11        helper(root);
12
13        HashSet<Integer> vi = new HashSet<>();
14        Queue<int[]> q = new LinkedList<>();
15        q.add(new int[]{start, 0});
16
17        int max = 0;
18
19        while (!q.isEmpty()) {
20            int[] p = q.poll();
21
22            if (vi.contains(p[0])) continue;
23
24            vi.add(p[0]);   // 🔥 missing line
25            max = Math.max(max, p[1]);
26
27            for (int nbr : map.get(p[0])) {
28                if (!vi.contains(nbr)) {
29                    q.add(new int[]{nbr, p[1] + 1});
30                }
31            }
32        }
33        return max;
34    }
35
36    public void helper(TreeNode root) {
37        if (root == null) return;
38
39        if (root.left != null) {
40            map.get(root.val).add(root.left.val);
41            map.get(root.left.val).add(root.val);
42        }
43
44        if (root.right != null) {
45            map.get(root.val).add(root.right.val);
46            map.get(root.right.val).add(root.val);
47        }
48
49        helper(root.left);
50        helper(root.right);
51    }
52}
53