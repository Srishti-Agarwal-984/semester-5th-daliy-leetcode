// Last updated: 7/31/2025, 5:32:29 PM
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return flip(root1 , root2);
    }
    public boolean flip(TreeNode root1, TreeNode root2){
        if(root1 == root2 && root1 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        boolean f = flip(root1.left, root2.right) && flip(root1.right, root2.left);
        boolean nf = flip(root1.left, root2.left) && flip(root1.right, root2.right);
        return nf || f;

    }
}