// Last updated: 10/8/2025, 7:45:23 AM
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
     int maxSum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode nn = new TreeNode();
        nn.right = bstToGst(root.right);
        nn.val=root.val+maxSum;
        maxSum=nn.val;
        nn.left = bstToGst(root.left);
        
        return nn;
    }
}