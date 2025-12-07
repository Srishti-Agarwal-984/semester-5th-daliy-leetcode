// Last updated: 12/7/2025, 8:56:55 PM
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
17    public int rob(TreeNode root) {
18        HashMap<TreeNode, HashMap<Integer, Integer>> map = new HashMap<>();
19       
20        return helper(root, map, 0);
21
22        
23        
24        
25    }
26    public int helper(TreeNode root, HashMap<TreeNode, HashMap<Integer, Integer>> map, int c){
27        if(root==null){
28            return 0;
29        }
30        if(map.containsKey(root) && map.get(root).containsKey(c)){
31            return map.get(root).get(c);
32        }
33        int rob = 0;
34        if(c==0){
35            rob=root.val+helper(root.right, map, 1)+helper(root.left, map, 1);
36        }
37        int norob = helper(root.right, map, 0)+helper(root.left, map, 0);
38       map.put(root, new HashMap<>());
39       map.get(root).put(c,Math.max(rob, norob) );
40        return Math.max(rob, norob);
41    }
42
43}