// Last updated: 7/31/2025, 5:38:36 PM
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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            ListNode r =lists[i];
            while(r!=null){
                arr.add(r.val);
                r=r.next;
            }

        }
        Collections.sort(arr);
        ListNode we = new ListNode();
        ListNode rtu = we;
        while(arr.size()>0){
            ListNode r1 = new ListNode();
            r1.val = arr.get(0);
            arr.remove(0);
            we.next = r1;
            we = we.next;
        }
        return rtu.next;



        
    }
}