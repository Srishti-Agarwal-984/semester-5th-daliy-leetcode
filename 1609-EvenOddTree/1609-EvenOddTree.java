// Last updated: 12/19/2025, 1:31:42 PM
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
17    public boolean isEvenOddTree(TreeNode root) {
18        if(root==null){
19            return true;
20        }
21        
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24        boolean ans = true;
25        int idx=0;
26        while(!q.isEmpty()){
27            int n = q.size();
28            int prev = (idx % 2 == 0) ? 0 : 10000000;
29            for(int i = 0; i<n; i++){
30                TreeNode rv = q.poll();
31                if(idx % 2 == 0 && (rv.val % 2 == 0 || rv.val <= prev)){
32                    return false;
33                }
34                if(idx % 2 == 1 && (rv.val % 2 == 1 || rv.val >= prev)){
35                    return false;
36                }
37                prev = rv.val;
38                if(rv.left != null){
39                    q.add(rv.left);
40                }
41                if(rv.right != null){
42                    q.add(rv.right);
43                }
44            }
45            idx++;
46
47        }
48        return true;
49    }
50}