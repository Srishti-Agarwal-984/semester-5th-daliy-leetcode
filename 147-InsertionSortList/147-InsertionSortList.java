// Last updated: 7/31/2025, 5:36:30 PM
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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp =head;
        List<Integer> ar = new ArrayList<>();
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ar);
        temp = head;
        while(temp!=null){
            temp.val = ar.get(0);
            ar.remove(0);
            temp=temp.next;
        }
        return head;
        
    }
}