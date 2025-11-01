// Last updated: 11/1/2025, 8:01:00 AM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = -1;
        for(int num : nums) {
            max = num > max? num : max;
        }

        boolean[] bool = new boolean[max + 1];
        for(int num : nums) {
            bool[num] = true;
        }
        ListNode ans = new ListNode();
        ListNode ans1 = new ListNode();
        ans=ans1;

        ListNode ghj = head;
        while(ghj!=null){
            ListNode rt = new ListNode();
            int r = ghj.val;
            boolean hj=false;
            if(r<bool.length && bool[r]){
                hj=true;
            }
            if(!hj){
                rt.val=r;
                ans1.next = rt;
                ans1 = ans1.next;
            }
            ghj=ghj.next;
        }
        return ans.next;


        
    }
}