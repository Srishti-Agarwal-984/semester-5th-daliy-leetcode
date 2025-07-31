// Last updated: 7/31/2025, 5:31:23 PM
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
class Solution {
    public int getDecimalValue(ListNode head) {
        int y = 0;
        while(head!=null){
            y=y*2+head.val;
            head = head.next;
        }
        return y;
    }
}