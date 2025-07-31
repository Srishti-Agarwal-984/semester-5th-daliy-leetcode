// Last updated: 7/31/2025, 5:37:05 PM
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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(root,1);
        List<List<Integer>> ans2 = new ArrayList<>();
        for(int i=ans.size()-1; i>=0; i--){
            ans2.add(ans.get(i));
        }

        return ans2;
    }
    public void helper(TreeNode root , int curr){
        if(root==null){
            return;
        }
        
        if(ans.size()<curr){
            List<Integer> ans1 = new ArrayList<>();
            ans1.add(root.val);
            ans.add(ans1);
        }
        else{
            ans.get(curr-1).add(root.val);

        }
        helper(root.left,curr+1);
        helper(root.right, curr+1);

    }
}