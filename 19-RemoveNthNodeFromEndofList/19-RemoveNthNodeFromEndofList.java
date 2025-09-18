// Last updated: 9/18/2025, 9:34:05 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        int k=n;
        ListNode df = head;
        while(df!=null){
            df= df.next;
            count++;
        }
        if(count==n){
            return head.next;
        }
        count-=k;
        df=head;
        k=1;
        while(k<count){
            df=df.next;
            k++;
        }
        ListNode we =null;
        if(df!=null && df.next!=null && df.next.next!=null){
            we=df.next.next;
            df.next=we;
            return head;
        }
        df.next=we;
        return head;
        
    }
}