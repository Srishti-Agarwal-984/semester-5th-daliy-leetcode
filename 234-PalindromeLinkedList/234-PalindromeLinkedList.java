// Last updated: 10/8/2025, 6:39:56 AM
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode prev=null;

        while(head!=null){
            ListNode r1 = new ListNode();
            r1.val=head.val;
            r1.next=prev;
            prev=r1;
            head=head.next;
        }
        while(prev!=null && temp!=null){
            if(prev.val!=temp.val){
                return false;
            }
            prev=prev.next;
            temp=temp.next;
        }
        return true;
        
    }

}