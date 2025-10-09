// Last updated: 10/9/2025, 2:06:05 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        ans[0]=root.val;
        dfs(root, ans);
        return ans[0];
    }
    private int dfs(TreeNode node, int[] ans) {
        if (node == null) {
            return 0;
        }

        // Recursively compute the maximum sum of the left and right subtree paths.
        int leftSum = Math.max(0, dfs(node.left, ans));
        int rightSum = Math.max(0, dfs(node.right, ans));

        // Update the maximum path sum encountered so far (with split).
        ans[0] = Math.max(ans[0], leftSum + rightSum + node.val);

        // Return the maximum sum of the path (without split).
        return Math.max(leftSum, rightSum) + node.val;
    }    
}