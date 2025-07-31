// Last updated: 7/31/2025, 5:35:55 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode rt = head;

        while(rt!=null){
            ListNode ahead = rt.next;
            rt.next=p;
            p=rt;
            rt=ahead;

        }
        return p;
    }
}