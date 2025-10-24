// Last updated: 10/24/2025, 10:51:14 PM
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
    TreeNode first=null, second=null, prev=null;
    public void recoverTree(TreeNode root) {
        if(root==null){
            return;
        }
        helper(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;

        
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        if(prev!=null && prev.val>root.val){
           if(first==null)
                first=prev;
            second=root;
        }
        prev=root;
        helper(root.right);

    }
}