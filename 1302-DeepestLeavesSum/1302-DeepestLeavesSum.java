// Last updated: 9/21/2025, 11:10:47 PM
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
    public int deepestLeavesSum(TreeNode root) {
        List<Integer> st = new ArrayList<>();
        helper(st, root, 0);
        
        return st.get(st.size()-1);
    }
    public void helper(List<Integer> st, TreeNode root, int c){
        if(root==null){
            return;
        }
        if(c==st.size()){
            st.add(0);
        }
        st.set(c,st.get(c)+root.val);
        helper(st, root.left, c+1);
        helper(st, root.right, c+1);


    }
}