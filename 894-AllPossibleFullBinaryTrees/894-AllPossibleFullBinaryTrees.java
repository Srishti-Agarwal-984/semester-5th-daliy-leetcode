// Last updated: 10/12/2025, 4:22:00 PM
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
    public List<TreeNode> allPossibleFBT(int n) {
        return helper(n);

    }
    public List<TreeNode> helper(int n){
        List<TreeNode> li = new ArrayList<>();
        n=n-1;
        for(int i=1; i<n;i++){
            List<TreeNode> left=helper(i);
            List<TreeNode> right=helper(n-i);
            for(int l=0; l<left.size(); l++){
                for(int r=0; r<right.size(); r++){
                    TreeNode nn =new TreeNode();
                    nn.val=0;
                    nn.left=left.get(l);
                    nn.right = right.get(r);
                    li.add(nn);
                }
            }
        }
        if(n==0){
            TreeNode nn =new TreeNode();
            nn.val=0;
            li.add(nn);
        }

        return li;

    }
}