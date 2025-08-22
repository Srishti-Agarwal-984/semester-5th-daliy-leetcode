// Last updated: 8/22/2025, 8:21:17 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        List<Integer> st = new ArrayList<>();
        return helper(st, root,0);
    }
    public boolean helper(List<Integer> st, TreeNode root, int c){
        if(root==null){
            return true;
        }
        if(c==st.size()){
            if(c%2==0 && root.val%2==0){
                return false;
            }
            if(c%2!=0 && root.val%2!=0){
                return false;
            }
            st.add(root.val);
        }
        else{
            int r = st.get(c);
            if(c%2==0){
                if(root.val<=r || root.val%2==0){
                    return false;
                }
                st.set(c, root.val);
            }
            else{
                if(root.val>=r || root.val%2!=0){
                    return false;
                }
                st.set(c, root.val);
            }
        }
        boolean left = helper(st, root.left,c+1);
        boolean right = helper(st, root.right,c+1);
        return left && right;

    }
}