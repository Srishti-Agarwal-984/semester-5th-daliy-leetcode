// Last updated: 12/19/2025, 3:22:42 PM
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
17    public int[] findMode(TreeNode root) {
18        List<Integer> li = new ArrayList<>();
19        helper(root, li, Integer.MIN_VALUE, Integer.MAX_VALUE);
20        //Collections.sort(li);
21        HashMap<Integer, Integer> map = new HashMap<>();
22        int r=0;
23        for(int i: li){
24            map.put(i, map.getOrDefault(i, 0)+1);
25            r = Math.max(r, map.get(i));
26        }
27        li = new ArrayList<>();
28        for(int k: map.keySet()){
29            if(map.get(k)==r){
30                li.add(k);
31            }
32        }
33        int[] ans = new int[li.size()];
34        int c =0;
35        for(int i: li){
36            ans[c]=i;
37            c++;
38        }
39
40        return ans;
41
42
43        
44    }
45    public boolean helper(TreeNode root, List<Integer> li, int min, int max){
46        if(root==null){
47            return true;
48        }
49        boolean left = helper(root.left, li, min, root.val);
50        boolean right = helper(root.right, li, root.val, max);
51        if(left && right && root.val>=min && root.val<=max){
52            li.add(root.val);
53            return true;
54
55        }
56        return false;
57    }
58}