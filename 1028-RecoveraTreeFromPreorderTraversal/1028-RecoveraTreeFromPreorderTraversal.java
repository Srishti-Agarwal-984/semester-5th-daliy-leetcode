// Last updated: 10/9/2025, 5:58:31 PM
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
    public TreeNode recoverFromPreorder(String traversal) {
        if (traversal == null || traversal.isEmpty()) return null;

        int i = 0;
        int n = traversal.length();

        // First node (root)
        int s1 = 0;
        while (i < n && traversal.charAt(i) != '-') {
            s1 = s1 * 10 + (traversal.charAt(i) - '0');
            i++;
        }
        TreeNode root = new TreeNode(s1);

        Stack<Demo> st = new Stack<>();
        st.push(new Demo(root, 0));

        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int val = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                val = val * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(val);

            // Adjust stack to correct depth
            while (!st.isEmpty() && st.peek().level >= depth) {
                st.pop();
            }

            // Attach node to parent
            if (!st.isEmpty()) {
                TreeNode parent = st.peek().node;
                if (parent.left == null) {
                    parent.left = node;
                } else {
                    parent.right = node;
                }
            }

            st.push(new Demo(node, depth));
        }

        return root;
    }

    class Demo {
        TreeNode node;
        int level;
        public Demo(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}