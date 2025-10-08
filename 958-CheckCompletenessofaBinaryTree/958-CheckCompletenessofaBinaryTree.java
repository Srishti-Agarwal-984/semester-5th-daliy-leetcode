// Last updated: 10/8/2025, 6:57:23 AM
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
    List<Integer> li = new ArrayList<>();
    public boolean isCompleteTree(TreeNode root) {
        helper(root, 0);
        int a=li.get(0);
        for(int i=0; i<li.size()-1; i++){
            if(li.get(i)<li.get(i+1) || Math.abs(a-li.get(i+1))>=2){
                return false;
            }
            
            a=Math.max(a, li.get(i+1));
        }
        return true;
    }
    public void helper(TreeNode root, int c){
        if(root==null){
            li.add(c);
            return;
        }
        helper(root.left, c+1);
        helper(root.right, c+1);
    }
}