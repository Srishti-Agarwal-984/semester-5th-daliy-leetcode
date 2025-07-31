// Last updated: 7/31/2025, 5:35:12 PM
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
    public ListNode oddEvenList(ListNode head) {
        ListNode as = head;
        ListNode as1 = new ListNode();
        ListNode as2 = new ListNode();
        ListNode as11 = as1;
        ListNode as12 = as2;
        int count =0;
        while(as!=null){
            if(count%2!=0){
                as1.next = as;
                as1=as1.next;
            }
            else{
                as2.next = as;
                as2=as2.next;

            }
            as= as.next;
            count++;
        }
        as1.next=null;
        as2.next = as11.next;
        return as12.next;



        
    }
}