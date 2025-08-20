// Last updated: 8/20/2025, 6:28:52 AM
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        helper(root1, l1);
        helper(root2, l1);
        Collections.sort(l1);
        return l1;
    }
    public void helper(TreeNode nn,  List<Integer> l1){
        if(nn==null){
            return;
        }
        l1.add(nn.val);
        helper(nn.left, l1);
        helper(nn.right, l1);
    }

}