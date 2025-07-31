// Last updated: 7/31/2025, 5:37:25 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        List<Integer> ar = new ArrayList<>();
        if(head==null){
            return head;
        }
        int w = temp.val;
        temp=temp.next;
        int c=0;
        while(temp!=null){
            if(w==temp.val){
                c++;
            }
            else{
                if(c==0){
                    ar.add(w);

                }
                w=temp.val;
                c=0;

            }
            temp = temp.next;
        }
        if(c==0){
            ar.add(w);
        }


        ListNode gh = new ListNode();
        ListNode gh2 = gh;
        for(int i=0; i<ar.size(); i++){
            ListNode gh1 = new ListNode();
            gh1.val=ar.get(i);
            gh.next = gh1;
            gh = gh.next;
        }
        return gh2.next;
        
        
    }
}