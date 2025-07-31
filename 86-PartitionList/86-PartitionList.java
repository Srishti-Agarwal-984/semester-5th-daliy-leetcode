// Last updated: 7/31/2025, 5:37:24 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode gh = new ListNode();
        ListNode fh = new ListNode();
        ListNode eh = new ListNode();
        ListNode p = eh;
        ListNode pv = fh;
        ListNode p1 = gh;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                gh.next=temp;
                gh=gh.next;
            }
            // else if (temp.val>x){
            //     fh.next=temp;
            //     fh=fh.next;
            // }
            else{
                eh.next=temp;
                eh=eh.next;
            }
            temp=temp.next;
        }
        gh.next=p.next;
        eh.next=null;
        return p1.next;


        
    }
}