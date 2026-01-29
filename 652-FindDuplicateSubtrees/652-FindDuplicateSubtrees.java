// Last updated: 1/29/2026, 4:44:55 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    HashMap<String,Integer> map = new HashMap<>();
18    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
19        List<TreeNode> ans = new ArrayList<>();
20        map.clear();
21        helper(root,ans);
22        return ans;
23    }
24    public String helper(TreeNode root, List<TreeNode> ans){
25        if(root == null){
26            return "null";
27        }
28
29        String str = "";
30        str += root.val +"-"+ helper(root.left,ans) +"-" + helper(root.right,ans)+"-";
31        if(map.containsKey(str) && map.get(str) == 1){
32            ans.add(root);
33        }
34        map.put(str,map.getOrDefault(str,0)+1);
35        return str;
36    }
37}