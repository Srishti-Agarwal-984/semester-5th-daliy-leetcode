// Last updated: 7/31/2025, 5:36:36 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        int c=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                c=1;
                break;
            }

        }
        if(c==0){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}