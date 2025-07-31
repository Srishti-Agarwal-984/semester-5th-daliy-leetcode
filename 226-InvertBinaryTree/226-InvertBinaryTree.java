// Last updated: 7/31/2025, 5:35:46 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode ans = help(root);
        return ans;
    }
    public TreeNode help(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode le = help(root.left);
        TreeNode ri = help(root.right);
        root.left = ri;
        root.right = le;
        return root;
    }
}