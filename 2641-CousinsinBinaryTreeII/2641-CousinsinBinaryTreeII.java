// Last updated: 1/6/2026, 8:29:34 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode replaceValueInTree(TreeNode root) {
18        List<Integer> li = new ArrayList<>();
19        helper(li, 0, root);
20        TreeNode nn = maker(li, root, null, 0);
21        return nn;
22    }
23
24    public void helper(List<Integer> li, int c, TreeNode root) {
25        if (root == null) {
26            return;
27        }
28        if (li.size() == c) {
29            li.add(root.val);
30        } else {
31            li.set(c, li.get(c) + root.val);
32        }
33        helper(li, c + 1, root.left);
34        helper(li, c + 1, root.right);
35    }
36
37    public TreeNode maker(List<Integer> li, TreeNode root, TreeNode parent, int c) {
38        if (root == null) {
39            return null;   // 🔴 FIX 1
40        }
41
42        TreeNode w = new TreeNode();
43        int v = li.get(c);
44
45        if (parent != null) {
46            if (parent.left != null) {
47                v = v - parent.left.val;
48            }
49            if (parent.right != null) {
50                v = v - parent.right.val;
51            }
52        }
53
54        if (c == 0) {
55            v = 0;
56        }
57
58        w.val = v;
59
60        // 🔴 FIX 2: call maker(), not helper()
61        w.left = maker(li, root.left, root, c + 1);
62        w.right = maker(li, root.right, root, c + 1);
63
64        return w;
65    }
66}
67