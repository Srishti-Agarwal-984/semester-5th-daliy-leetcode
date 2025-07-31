// Last updated: 7/31/2025, 5:34:04 PM
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
    public List<Integer> largestValues(TreeNode root) {
        helper(root, 0);
        return st;
    }
    public void helper(TreeNode root, int i){
        if(root==null){
            return;
        }
        if(st.isEmpty()){
            st.add(root.val);
        }
        else{
            if(st.size()<=i){
                st.add(root.val);
            }
            else{
                st.set(i, Math.max(st.get(i), root.val));
            }
        }
        helper(root.left, i+1);
        helper(root.right, i+1);
    }
}