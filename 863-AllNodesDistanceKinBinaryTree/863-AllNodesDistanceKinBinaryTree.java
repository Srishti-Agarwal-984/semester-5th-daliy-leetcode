// Last updated: 10/8/2025, 1:28:38 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        int p=k;
        if(k==0){
            ans.add(target.val);
            return ans;
        }
        HashMap<TreeNode, Integer> map = helper(root, target, k);
        return ans;


    }
    public HashMap<TreeNode, Integer> helper(TreeNode root, TreeNode target, int k){
        if(root==null ){
            return new HashMap<>();
        }
        
        HashMap<TreeNode, Integer> left =helper(root.left,target, k);
        HashMap<TreeNode, Integer> right= helper(root.right,target, k);
        HashMap<TreeNode, Integer> nn = new HashMap<>();
        if(left.containsKey(target)){
            for(TreeNode a: right.keySet()){
                if(right.get(a)+left.get(target)==k-2){
                    ans.add(a.val);
                }
            }
            if(target!=root && left.get(target)+1==k){
                ans.add(root.val);
            }
            nn.put(target, left.get(target)+1);
            return nn;
        }
        else if(right.containsKey(target)){
            for(TreeNode a: left.keySet()){
                if(left.get(a)+right.get(target)==k-2){
                    ans.add(a.val);
                }
            }
            if(target!=root && right.get(target)+1==k){
                ans.add(root.val);
            }
            nn.put(target, right.get(target)+1);
            return nn;
        }
        else if(root==target){
            for(TreeNode a: left.keySet()){
                if(left.get(a)+1==k){
                    ans.add(a.val);
                }
            }
            for(TreeNode a: right.keySet()){
                if(right.get(a)+1==k){
                    ans.add(a.val);
                }
            }
            nn.put(root, 0);
            return nn;
        }
        for(TreeNode a: left.keySet()){
            nn.put(a, left.get(a)+1);
        }
        for(TreeNode a: right.keySet()){
            nn.put(a, right.get(a)+1);
        }
        nn.put(root, 0);
        return nn;
    
    }
}