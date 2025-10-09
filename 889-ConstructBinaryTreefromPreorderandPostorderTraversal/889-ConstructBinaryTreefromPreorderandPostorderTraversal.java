// Last updated: 10/9/2025, 12:26:32 PM
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<postorder.length; i++){
            map.put(postorder[i], i);
        }
        return helper(preorder,map,0,postorder.length-1,0, postorder.length-1);

        
    }
    public TreeNode helper(int[] preorder, HashMap<Integer, Integer> map,int si, int en, int s2, int e2){
        if(si>en || s2>e2){
            return null;
        }
        TreeNode nn = new TreeNode();
        nn.val=preorder[si];
        int a =-1;
        int b=-1;
        if(si<en){
            b=map.get(preorder[si+1]);
            a=map.get(preorder[si+1]);
            a=a-s2;
        }
        nn.left=helper(preorder,map,si+1,si+a+1, s2,b);
        nn.right=helper(preorder,map,si+a+2,en,b+1,e2-1);
        return nn;

    }
}