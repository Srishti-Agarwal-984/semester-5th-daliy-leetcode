// Last updated: 7/31/2025, 5:36:35 PM
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
    public void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p2   = reverse(slow.next);
        slow.next=null;
        ListNode p1 = head;
        while(p1!=null && p2!=null){
            ListNode ahead1 = p1.next;
            ListNode ahead2 = p2.next;
            p1.next = p2;
            p2.next = ahead1;
            p1 = ahead1;
            p2 = ahead2;
        }
    }
    public ListNode reverse(ListNode g){
        ListNode prev=null;
        while(g!=null){
            ListNode ahead = g.next;
            g.next = prev;
            prev = g;
            g=ahead;
        }
        return prev;
    }
}