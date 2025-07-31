// Last updated: 7/31/2025, 5:34:05 PM
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
    int r=0;
    public int findBottomLeftValue(TreeNode root) {
        helper(root,1);
        return r;
    }
    int max=0;
    public void helper(TreeNode root, int curr){
        if(root==null){
            return;
        }
        if(max<curr){
            r=root.val;
            max=curr;
        }
        helper(root.left, curr+1);
        helper(root.right, curr+1);


    }

}