// Last updated: 7/31/2025, 5:28:25 PM
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
 import java.util.*;
class Solution {
    public ListNode removeNodes(ListNode head) {
        List<Integer> st = new ArrayList<>();
        ListNode a = head;
        while(a!=null){
            while(st.size()>=1 && st.get(st.size()-1)<a.val){
                st.remove(st.size()-1);
            }
            st.add(a.val);
            a=a.next;
        }
        a=new ListNode();
        ListNode r =a;
        for(int i=0; i<st.size(); i++){
            ListNode gh = new ListNode();
            gh.val = st.get(i);
            a.next = gh;
            a=a.next;
        }
        return r.next;

        
    }
}