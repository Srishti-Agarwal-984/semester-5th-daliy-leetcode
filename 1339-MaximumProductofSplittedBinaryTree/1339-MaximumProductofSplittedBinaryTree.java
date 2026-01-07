// Last updated: 1/7/2026, 8:34:34 AM
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
17    long max = 0;
18    long MOD = 1_000_000_007;
19
20    public int maxProduct(TreeNode root) {
21        long totalSum = cal(root);
22        helper(root, totalSum);
23        return (int)(max % MOD);
24    }
25
26    public long cal(TreeNode root) {
27        if (root == null) return 0;
28        return root.val + cal(root.left) + cal(root.right);
29    }
30
31    public long helper(TreeNode root, long totalSum) {
32        if (root == null) return 0;
33
34        long left = helper(root.left, totalSum);
35        long right = helper(root.right, totalSum);
36
37        long subTreeSum = left + right + root.val;
38
39        max = Math.max(max, subTreeSum * (totalSum - subTreeSum));
40
41        return subTreeSum;
42    }
43}
44