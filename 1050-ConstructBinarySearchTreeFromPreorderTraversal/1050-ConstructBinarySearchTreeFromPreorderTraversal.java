// Last updated: 7/31/2025, 5:32:14 PM
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
    public TreeNode bstFromPreorder(int[] preorder) {
        idx=0;
        int[] inorder = new int[preorder.length];

        for(int i=0; i<preorder.length; i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i=0; i<preorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode ans = help(preorder, map, idx, preorder.length-1);
        return ans;

    }
    public TreeNode help(int[] preorder, HashMap<Integer,Integer> map , int si, int en){
        if(si>en){
            return null;
        }
        TreeNode st = new TreeNode(preorder[idx]);
        int a =map.get(preorder[idx]);
        idx++;
        st.left = help(preorder, map, si, a-1);
        st.right = help(preorder, map, a+1,en );
        return st;

    }
}