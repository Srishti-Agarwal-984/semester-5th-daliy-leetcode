// Last updated: 7/31/2025, 5:37:04 PM
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
    private int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx=postorder.length-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode ans = helper(postorder, map,0, inorder.length-1);
        return ans;
    }
    public TreeNode helper(int[] postorder, HashMap<Integer, Integer> map, int si , int end){
        if(si>end){
            return null;
        }
        TreeNode root = new TreeNode();
        root.val=postorder[idx];
        int a = map.get(postorder[idx]);
        idx--;
        root.right = helper(postorder, map,a+1, end );
        root.left = helper(postorder, map,si, a-1);
        return root;
    }
}