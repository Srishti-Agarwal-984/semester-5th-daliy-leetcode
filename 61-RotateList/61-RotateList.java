// Last updated: 7/31/2025, 5:37:46 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int cn=0;
        while(temp!=null){
            cn++;
            temp=temp.next;
        }
        if(cn==0 || k%cn==0){
            return head;
        }
        int r = (cn-k%cn)-1;
        temp=head;

        while(r>0){
            temp=temp.next;
            r--;
        }
        ListNode rt = temp;
        ListNode kl = temp.next;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=head;
            rt.next=null;
            return kl;
        }
        return head;
    }
}