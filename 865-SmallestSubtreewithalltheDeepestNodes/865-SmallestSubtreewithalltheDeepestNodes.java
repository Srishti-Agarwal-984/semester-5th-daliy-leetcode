// Last updated: 1/9/2026, 7:16:31 AM
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
17    int mt=0;
18    TreeNode ans=null;
19    public TreeNode subtreeWithAllDeepest(TreeNode root) {
20        int a = helper(root,0);
21        return ans;
22    }
23    public int helper(TreeNode root, int c){
24        mt=Math.max(mt, c);
25        if(root==null){
26            return c;
27        }
28        int left=helper(root.left,c+1);
29        int right = helper(root.right, c+1);
30        if(left == mt && right == mt){
31            ans = root;
32        }
33        
34        return Math.max(left, right);
35       
36    }
37}