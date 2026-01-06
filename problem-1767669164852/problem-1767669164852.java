// Last updated: 1/6/2026, 8:42:44 AM
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
17    List<Integer> a = new ArrayList<>();
18    public int maxLevelSum(TreeNode root) {
19        helper(root, 0);
20        int min=Integer.MIN_VALUE;
21        int idx=-1;
22        for(int i=0; i<a.size(); i++){
23            if(a.get(i)>min){
24                idx=i+1;
25                min=a.get(i);
26            }
27
28        }
29        return idx;
30    }
31    public void helper(TreeNode root, int c){
32        if(root==null){
33            return;
34        }
35        if(c== a.size()){
36            a.add(root.val);
37        }
38        else{
39            a.set(c, a.get(c)+root.val);
40        }
41        helper(root.left, c+1);
42        helper(root.right, c+1);
43    }
44}