// Last updated: 7/31/2025, 5:37:01 PM
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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int le = maxDepth(root.left);
        int ri = maxDepth(root.right);
        if(Math.abs(le-ri)>1){
            return false;
        }
        boolean lei = isBalanced(root.left);
        boolean rei = isBalanced(root.right);
        return lei && rei;


        
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int le = maxDepth(root.left);
        int ri = maxDepth(root.right);
        return Math.max(le, ri)+1;
        
    }
}