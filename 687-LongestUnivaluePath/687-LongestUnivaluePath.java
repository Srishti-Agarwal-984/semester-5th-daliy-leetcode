// Last updated: 12/26/2025, 9:24:19 AM
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
17    int max=0;
18    public int longestUnivaluePath(TreeNode root) {
19        if(root==null){
20            return 0;
21        }
22        path(root);
23        return max;
24
25        
26    }
27    public int path(TreeNode root){
28        if(root==null){
29            return 0;
30        }
31        int left = path(root.left);
32        int e=0;
33        int p = 0;
34        if(root.left!=null && root.val==root.left.val){
35            e = e+left+1;
36            p=Math.max(p, left+1);
37            // if(left==0){
38            //     e=e+1;
39            // }
40        }
41        int right = path(root.right);
42        if(root.right!=null && root.val==root.right.val){
43            e = e+right+1;
44            p=Math.max(right+1, p);
45            
46        }
47        max = Math.max(max, e);
48        return p;
49    }
50}