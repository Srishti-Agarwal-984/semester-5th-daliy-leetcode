// Last updated: 7/31/2025, 5:29:11 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode rt = new ListNode();
        ListNode rty = rt;
        ListNode gh = head;
        int sum=0;
        while(gh!=null){
            ListNode r = new ListNode();
            if(gh.val!=0){
                sum+=gh.val;
            }
            else{
                r.val= sum;
                sum=0;
                rt.next=r;
                rt=rt.next;
                
            }
            gh = gh.next;
        }
        return rty.next.next;
        
    }
}