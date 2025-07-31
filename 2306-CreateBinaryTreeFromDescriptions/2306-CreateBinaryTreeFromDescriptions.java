// Last updated: 7/31/2025, 5:29:09 PM
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> qw = new HashSet<>();
        for(int i=0; i<descriptions.length; i++){
            TreeNode f = new TreeNode();
            qw.add(descriptions[i][0]);
            if(map.containsKey(descriptions[i][0])){
                TreeNode k = map.get(descriptions[i][0]);
                if(descriptions[i][2]==1){
                    k.left = new TreeNode(descriptions[i][1]);
                }
                else{
                    k.right = new TreeNode(descriptions[i][1]);
                }
                map.put(descriptions[i][0],k);
            }
            else{
                TreeNode k = new TreeNode(descriptions[i][0]);
                if(descriptions[i][2]==1){
                    k.left = new TreeNode(descriptions[i][1]);
                }
                else{
                    k.right = new TreeNode(descriptions[i][1]);
                }
                map.put(descriptions[i][0],k);
            }
        }
        for(Integer keys : map.keySet()){
            TreeNode r = map.get(keys);
            if(r.left!=null && map.containsKey(r.left.val)){
                r.left=map.get(r.left.val);
            }
            if(r.right!=null && map.containsKey(r.right.val)){
                r.right=map.get(r.right.val);
            }
            map.put(keys, r);
        }
        int c1=0;
        for(int rp: qw){
            int c=0;
            for(int i=0; i<descriptions.length; i++){
                if(rp==descriptions[i][1]){
                    c=1;
                    break;
                }

            }
            if(c==0){
                c1 = rp;
                break;
            }
        }
        return map.get(c1);

    }
}