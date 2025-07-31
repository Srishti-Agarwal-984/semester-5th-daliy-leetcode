// Last updated: 7/31/2025, 5:37:07 PM
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode ans = helper(preorder, map,0, inorder.length-1);
        return ans;
    }
    public TreeNode helper(int[] preorder, HashMap<Integer, Integer> map, int si , int end){
        if(si>end){
            return null;
        }
        TreeNode root = new TreeNode();
        root.val=preorder[idx];
        int a = map.get(preorder[idx]);
        idx++;
        root.left = helper(preorder, map,si, a-1);
        root.right = helper(preorder, map,a+1, end );
        
        return root;
    }
}