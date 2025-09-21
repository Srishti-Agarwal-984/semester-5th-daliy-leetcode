// Last updated: 9/21/2025, 9:25:56 PM
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
    int mt=0;
    TreeNode ans=null;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int a = helper(root,0);
        return ans;
    }
    public int helper(TreeNode root, int c){
        mt=Math.max(mt, c);
        if(root==null){
            return c;
        }
        int left=helper(root.left,c+1);
        int right = helper(root.right, c+1);
        if(left == mt && right == mt){
            ans = root;
        }
        
        return Math.max(left, right);
       
    }
}