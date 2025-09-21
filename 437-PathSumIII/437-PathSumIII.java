// Last updated: 9/21/2025, 5:29:16 PM
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        // count paths starting from root + paths in left subtree + paths in right subtree
        return countFrom(root, targetSum) 
             + pathSum(root.left, targetSum) 
             + pathSum(root.right, targetSum);
    }

    private int countFrom(TreeNode node, long target) {
        if (node == null) return 0;
        int count = 0;
        if (node.val == target) count++;
        // continue the path downward
        count += countFrom(node.left, target - node.val);
        count += countFrom(node.right, target - node.val);
        return count;
    }
}