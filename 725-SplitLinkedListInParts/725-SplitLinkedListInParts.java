// Last updated: 7/31/2025, 5:33:17 PM
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
    public ListNode[] splitListToParts(ListNode head, int k) {
       int n=0;
        ListNode rt = head;
        while(rt!=null){
            rt = rt.next;
            n++;
        }
        int r = n/k;
        int c=n%k;
        ListNode[] ans  = new ListNode[k];
        if(n<k){
            rt = head;
            int i=0;
            while(rt!=null){
    
                ListNode temp = rt.next;
                rt.next=null;
                ans[i]=rt;
                rt = temp;
                // rt=rt.next;
                i++;
            }
            return ans;
        }
        int i=0;
        rt = head;
        while(c!=0){
            r=n/k;
            ans[i]=rt;
            while(r!=0){
                rt=rt.next;
                r--;
            }
            ListNode temp = rt.next;
            rt.next=null;
            rt = temp;
            i++;
            c--;
        }
        while(i<k){
            r=n/k;
            r=r-1;
            ans[i]=rt;
            while(r!=0){
                rt=rt.next;
                r--;
            }
            ListNode temp = rt.next;
            rt.next=null;
            rt = temp;
            i++;
        }
        return ans;

        
        
    }
}