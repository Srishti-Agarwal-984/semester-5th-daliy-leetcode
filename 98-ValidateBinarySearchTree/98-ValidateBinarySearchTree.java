// Last updated: 7/31/2025, 5:37:15 PM
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
    public boolean isValidBST(TreeNode root) {
        boolean ans = check(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return ans;
        
    }
    public boolean check(TreeNode root, long low, long high){
        if(root==null){
            return true;
        }
        if(root.val<=low){
            return false;
        }
        if(root.val>=high){
            return false;
        }

        boolean we = check(root.left, low, root.val);
        boolean kl = check(root.right, root.val, high);
        return we && kl;
    }
}