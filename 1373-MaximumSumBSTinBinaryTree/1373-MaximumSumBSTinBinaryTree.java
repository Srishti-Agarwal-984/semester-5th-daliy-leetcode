// Last updated: 1/2/2026, 8:48:52 AM
1class Solution {
2    int maxSum = 0;
3
4    class Pair {
5        boolean isBST;
6        int sum;
7        int min, max;
8
9        Pair(boolean isBST, int sum, int min, int max) {
10            this.isBST = isBST;
11            this.sum = sum;
12            this.min = min;
13            this.max = max;
14        }
15    }
16
17    public int maxSumBST(TreeNode root) {
18        dfs(root);
19        return maxSum;
20    }
21
22    private Pair dfs(TreeNode root) {
23        if (root == null) {
24            return new Pair(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
25        }
26
27        Pair left = dfs(root.left);
28        Pair right = dfs(root.right);
29
30        if (left.isBST && right.isBST &&
31            root.val > left.max &&
32            root.val < right.min) {
33
34            int currSum = left.sum + right.sum + root.val;
35            maxSum = Math.max(maxSum, currSum);
36
37            return new Pair(
38                true,
39                currSum,
40                Math.min(left.min, root.val),
41                Math.max(right.max, root.val)
42            );
43        }
44
45        // Not a BST
46        return new Pair(false, 0, 0, 0);
47    }
48}
49