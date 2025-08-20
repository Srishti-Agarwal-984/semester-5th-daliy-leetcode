// Last updated: 8/20/2025, 11:18:39 PM
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
    int c=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] map = new int[10];
        helper(root,map);
        return c;

    }
    public void helper(TreeNode root, int[] map){
        if (root == null) return;

        // add current node
        map[root.val]++;

        // check only at leaf nodes
        if (root.left == null && root.right == null) {
            if (checker(map)) {
                c++;
            }
        } else {
            helper(root.left, map);
            helper(root.right, map);
        }

        // backtrack
        map[root.val]--;
    }
    public boolean checker(int[] map){
        int h=0;
        for(int i=0; i<map.length; i++){
            h=h+map[i]%2;
            if(h>=2){
                return false;
            }
        }
        return true;
    }
}