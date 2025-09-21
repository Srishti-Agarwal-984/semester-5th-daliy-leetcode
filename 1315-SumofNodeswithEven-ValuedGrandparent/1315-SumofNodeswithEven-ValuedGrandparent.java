// Last updated: 9/21/2025, 11:50:34 PM
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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root, root.left);
        helper(root, root.right);
        return sum;
        
    }
    public void helper(TreeNode root, TreeNode main_root){
        if(main_root==null){
            return;
        }
        if(root.val%2==0){
            if(main_root.left!=null){
                sum+=main_root.left.val;
            }
            if(main_root.right!=null){
                sum+=main_root.right.val;
            }
        }
        helper(main_root, main_root.left);
        helper(main_root, main_root.right);
    }
}