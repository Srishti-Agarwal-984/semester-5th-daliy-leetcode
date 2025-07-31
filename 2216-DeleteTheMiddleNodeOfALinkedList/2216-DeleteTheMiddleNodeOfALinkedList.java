// Last updated: 7/31/2025, 5:29:27 PM
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fi=head;
        ListNode r =head;
        int i=0;
        if(r.next==null){
            return null;
        }
        while(fi!=null && fi.next!=null){
            if(i>=1){
                r=r.next;
            }
            i++;
            fi=fi.next.next;
        }
        ListNode oi = null;
        if(r!=null && r.next!=null && r.next.next!=null){
            oi=r.next.next;
        }
        r.next=oi;
        
        return head;



        
    }
}