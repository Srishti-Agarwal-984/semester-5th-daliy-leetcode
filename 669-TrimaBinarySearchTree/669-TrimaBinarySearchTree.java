// Last updated: 8/20/2025, 4:44:50 PM
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return null;
        }
        TreeNode nn =  new TreeNode();
        nn.val=root.val;
        if(root.val<low){
            if(root.right==null){
                return null;
            }
            root=trimBST(root.right, low, high);
            if(root==null){
                return null;
            }
            nn.val=root.val;
        }
        if(root.val>high){

            root=trimBST(root.left, low, high);
            if(root==null){
                return null;
            }
            nn.val=root.val;
        }
        nn.left = trimBST(root.left, low, high);
        nn.right = trimBST(root.right, low, high);
        return nn;

    }
}