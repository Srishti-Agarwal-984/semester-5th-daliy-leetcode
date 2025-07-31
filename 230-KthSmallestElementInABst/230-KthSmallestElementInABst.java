// Last updated: 7/31/2025, 5:35:43 PM
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
    List<Integer> st =new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        Collections.sort(st);
        return st.get(k-1);

        
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        st.add(root.val);
        helper(root.right);
    }
}