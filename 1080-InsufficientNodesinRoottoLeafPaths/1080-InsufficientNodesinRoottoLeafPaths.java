// Last updated: 8/22/2025, 11:59:22 PM
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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        TreeNode ans = helper(root, limit, 0);
        return ans;

    }
    public TreeNode helper(TreeNode root, int limit, int sum){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            if(sum+root.val<limit){
                return null;
            }
            else{
                return root;
            }
        }
        TreeNode q = new TreeNode();
        q.val=root.val;
        q.left=helper(root.left, limit, sum+root.val);
        q.right=helper(root.right, limit, sum+root.val);
        if(q.left==null && q.right==null){
            return null;
        }
        return q;
    }
}