// Last updated: 10/25/2025, 12:32:26 AM
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
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        Pair p=helper(root);
        Collections.sort(li);
        return li.size()<k?-1:li.get(li.size()-k);
    }
    public Pair helper(TreeNode root){
        if(root==null){
            return new Pair(0,true);
        }
        Pair l=helper(root.left);
        Pair r = helper(root.right);
        boolean q=l.check && r.check && l.size==r.size;
        if(q){
            li.add(l.size+r.size+1);
        }
        return new Pair(l.size+r.size+1, q);
    }
    class Pair{
        int size;
        boolean check;
        public Pair(int size, boolean check){
            this.size=size;
            this.check=check;
        }
    }
}