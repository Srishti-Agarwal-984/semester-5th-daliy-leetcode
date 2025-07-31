// Last updated: 7/31/2025, 5:36:09 PM
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
class BSTIterator {
    List<Integer> st = new ArrayList<>();
    int i=0;
    public void helper(TreeNode root, List<Integer> st){
        if(root==null){
            return;
        }
        helper(root.left, st);
        st.add(root.val);
        helper(root.right, st);
    }

    public BSTIterator(TreeNode root) {
        helper(root,st);
    }
    
    public int next() {
        return st.get(i++);
    }
    
    public boolean hasNext() {
        return i<st.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */