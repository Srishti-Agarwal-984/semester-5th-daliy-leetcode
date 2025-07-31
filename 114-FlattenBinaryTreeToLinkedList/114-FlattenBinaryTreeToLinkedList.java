// Last updated: 7/31/2025, 5:36:56 PM
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
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        root.left = null;
        pre = root;

        
    }
}