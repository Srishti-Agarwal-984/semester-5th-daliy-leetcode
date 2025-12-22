// Last updated: 12/23/2025, 12:26:25 AM
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
17    public TreeNode constructMaximumBinaryTree(int[] nums) {
18        return helper(nums, 0, nums.length-1);
19        
20    }
21    public TreeNode helper(int[] nums, int si, int en){
22        if(si>en){
23            return null;
24        }
25        if(si==en){
26            return new TreeNode(nums[si]);
27        }
28        TreeNode nn= new TreeNode();
29        int r=-1;
30        int max = -1;
31        for(int i=si; i<=en; i++){
32            if(max<nums[i]){
33                r = i;
34                max = nums[i];
35            }
36
37        }
38        nn.val = nums[r];
39        nn.left = helper(nums, si, r-1);
40        nn.right = helper(nums, r+1, en);
41        return nn;
42    }
43}