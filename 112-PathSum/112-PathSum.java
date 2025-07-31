// Last updated: 7/31/2025, 5:36:58 PM
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return has(root,targetSum );

    }
    public boolean has(TreeNode root, int targetSum){
        
        if(root == null){
            return false;
        }
        if(root.left == null && root.right==null){
            return targetSum-root.val==0;
        }
        boolean left = has(root.left, targetSum-root.val);
        boolean right = has(root.right, targetSum-root.val);
        return left|| right;

    }
}