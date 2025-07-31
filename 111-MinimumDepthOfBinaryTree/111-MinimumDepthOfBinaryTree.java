// Last updated: 7/31/2025, 5:36:59 PM
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int le = minDepth(root.left);
        int ri = minDepth(root.right);
        if(le==0 ||ri==0){
            return Math.max(le,ri)+1;
        }
        return Math.min(le, ri)+1;
    }
}