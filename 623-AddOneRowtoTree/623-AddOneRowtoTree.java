// Last updated: 10/8/2025, 9:22:51 PM
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode nn =new TreeNode();
            nn.val=val;
            nn.left=root;
            return nn;
        }
        return helper(root,val,depth,1);
    }
    public TreeNode helper(TreeNode root, int val, int depth,int c){
        if(root==null){
            return null;
        }
        TreeNode nn = new TreeNode();
        nn.val=root.val;
        if(c+1==depth ){
            
            TreeNode left = root.left;
            TreeNode right = root.right;

            nn.left=new TreeNode(val);
            nn.left.left=left;
            nn.right =new TreeNode(val);
            nn.right.right=right;
            return nn;
        }
        //nn.val=root.val;
        nn.left=helper(root.left,val,depth,c+1);
        nn.right = helper(root.right,val,depth,c+1);
        return nn;
    }
}