// Last updated: 1/29/2026, 3:59:44 PM
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
17    int ans=0;
18    public int averageOfSubtree(TreeNode root) {
19        Pair s = helper(root);
20        return ans;
21        
22    }
23    public Pair helper(TreeNode root){
24        if(root==null){
25            return new Pair(0, 0);
26        }
27        Pair r = helper(root.right);
28        Pair l = helper(root.left);
29        int e = r.c+l.c+1;
30        int sum=root.val+r.val+l.val;
31        
32        int avg = (sum)/e;
33        if(avg==root.val){
34            ans++;
35        }
36        return new Pair(sum, e);
37    }
38    class Pair{
39        int val;
40        int c;
41        public Pair(int val, int c){
42            this.val = val;
43            this.c = c;
44        }
45    }
46
47}