// Last updated: 7/31/2025, 5:38:32 PM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c =0;
        ListNode temp= head;
        while(c<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            c++;
        }
        ListNode p= reverseKGroup(temp, k);
        temp= head;
        c=0;
        ListNode r = head;
        while(c<k){
            ListNode nn = temp.next;
            temp.next =p;
            p=temp;
            temp=nn;
            c++;
        }
        return p;


        
    }
}