// Last updated: 7/31/2025, 5:33:58 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode rt = head;
        int count  = 1;
        ListNode jk = null;
        while(rt!=null){
            if(count==k){
                jk = rt;


            }
            rt =rt.next;
            count++;
        }
        ListNode ty = head;
        count=count-k;
        k=count;
        count=1;
        while(ty!=null){
            if(count==k){
                rt = ty;
                break;


            }
            ty = ty.next;
            count++;
        }
        int u=ty.val;
        int p=jk.val;
        jk.val=u;
        ty.val = p;
        return head;

        
    }
}