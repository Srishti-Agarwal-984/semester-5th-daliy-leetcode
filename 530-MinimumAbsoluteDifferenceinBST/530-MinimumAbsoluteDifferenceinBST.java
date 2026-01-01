// Last updated: 1/1/2026, 9:16:31 PM
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
17    public int getMinimumDifference(TreeNode root) {
18        List<Integer> li = new ArrayList<>();
19        helper(li, root);
20        Collections.sort(li);
21        int max = Integer.MAX_VALUE;
22        for(int i=0; i<li.size()-1; i++){
23            max =Math.min(max, Math.abs(li.get(i+1)-li.get(i)));
24        }
25        return max;
26        
27    }
28    public void helper(List<Integer> li,TreeNode root){
29        if(root==null){
30            return ;
31        }
32        helper(li, root.right);
33        helper(li, root.left);
34        li.add(root.val);
35        
36
37    }
38}