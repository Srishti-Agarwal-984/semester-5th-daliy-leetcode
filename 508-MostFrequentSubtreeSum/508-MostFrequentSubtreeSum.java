// Last updated: 12/23/2025, 1:06:03 AM
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
17    HashMap<Integer, Integer> map = new HashMap<>();
18    public int[] findFrequentTreeSum(TreeNode root) {
19        int li = helper(root);
20        int max = 0;
21        for(int k: map.keySet()){
22            max = Math.max(max, map.get(k));
23        }
24        List<Integer> kl = new ArrayList<>();
25        for(int k: map.keySet()){
26            if(map.get(k)==max){
27                kl.add(k);
28            }
29        }
30        int[] ans = new int[kl.size()];
31        int i=0;
32        for(int jk: kl){
33            ans[i]=jk;
34            i++;
35        }
36        return ans;
37
38    }
39    public int helper(TreeNode root){
40        if(root == null){
41            return 0;
42        }
43        int ri = helper(root.right);
44        int li = helper(root.left);
45        map.put(ri+li+root.val, map.getOrDefault(ri+li+root.val, 0)+1);
46        return ri+li+root.val;
47    }
48}