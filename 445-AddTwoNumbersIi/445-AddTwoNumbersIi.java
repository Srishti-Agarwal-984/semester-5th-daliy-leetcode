// Last updated: 7/31/2025, 5:34:27 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode k1= l1, k2 = l2;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(k1!=null){
            s1.push(k1.val);
            k1 = k1.next;
        }
        while(k2!=null){
            s2.push(k2.val);
            k2 = k2.next;
        }
        int c=0;
        List<Integer> an = new ArrayList<>();
        while(!s1.isEmpty() && !s2.isEmpty()){
            int sum = s1.pop()+s2.pop()+c;
            c = sum/10;
            an.add(sum%10);
        }
        while(!s1.isEmpty()){
            int sum = s1.pop()+c;
            c = sum/10;
            an.add(sum%10);
        }
        while(!s2.isEmpty()){
            int sum = s2.pop()+c;
            c = sum/10;
            an.add(sum%10);
        }
        if(c>0){
            an.add(1);
        }
        l1= new ListNode();
        l2=l1;
        while(an.size()>0){
            ListNode u = new ListNode();
            u.val= an.get(an.size()-1);
            an.remove(an.size()-1);
            l1.next= u;
            l1= l1.next;
        }
        return l2.next;
    


        
    }
}
