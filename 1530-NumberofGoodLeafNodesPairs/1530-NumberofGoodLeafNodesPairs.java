// Last updated: 10/8/2025, 12:33:55 PM
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
    int ans=0;
    public int countPairs(TreeNode root, int distance) {
        List<Integer> li = helper(root, distance);
        return ans;
        
    }
    
    public List<Integer> helper(TreeNode root,  int c){
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> li = new ArrayList<>();
        List<Integer> l = helper(root.left,c);
        List<Integer> r = helper(root.right,c);
        for(int i=0; i<l.size(); i++){
            for(int j=0; j<r.size(); j++){
                if(l.get(i)+r.get(j)<=c){
                    ans++;
                }
            }
        }
        int r1=0;
        for(int i=0; i<l.size(); i++){
            if(l.get(i)<c){
                li.add(l.get(i)+1);
            }
        }
        for(int i=0; i<r.size(); i++){
            if(r.get(i)<c){
                li.add(r.get(i)+1);
            }
        }
        if(root.left==null && root.right==null){
            li.add(1);
        }

        
        return li;

    }
}