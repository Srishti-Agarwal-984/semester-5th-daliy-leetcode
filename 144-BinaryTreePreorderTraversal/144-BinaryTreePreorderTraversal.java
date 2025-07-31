// Last updated: 7/31/2025, 5:36:32 PM
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
    static List<Integer> k = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        List<List<Integer>> ar = new ArrayList<>();
        ans(root);
        ar.add(k);
        k =  new ArrayList<>();
        return ar.get(0);

    }
    public static void ans(TreeNode root){
        if(root==null){
            return;
        }
        // if(root.left==null && root.right==null){
        //     return;
        // }
    
        k.add(root.val);
        ans(root.left);
        ans(root.right);
    }

}