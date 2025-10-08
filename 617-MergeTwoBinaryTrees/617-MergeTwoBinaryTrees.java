// Last updated: 10/8/2025, 7:07:32 AM
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return null;
        }
        int sum=0;
        TreeNode nn = new TreeNode();
        root1=root1==null? new TreeNode(0) : root1;
        root2=root2==null? new TreeNode(0) : root2;
        nn.val = root1.val+root2.val;
        nn.left = mergeTrees(root1.left, root2.left);
        nn.right = mergeTrees(root1.right, root2.right);
        return nn;
        
    }
}