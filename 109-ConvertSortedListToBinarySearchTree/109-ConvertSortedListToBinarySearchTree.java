// Last updated: 7/31/2025, 5:37:02 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head, null);

    }
    public TreeNode helper(ListNode si, ListNode en){
        if(si==en){
            return null;
        }
        ListNode slow = si;
        ListNode fast= si;
        while(fast!=en && fast.next!=en){
            slow = slow.next;
            fast=fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(si,slow);
        root.right = helper(slow.next, en);
        return root;

    }

}