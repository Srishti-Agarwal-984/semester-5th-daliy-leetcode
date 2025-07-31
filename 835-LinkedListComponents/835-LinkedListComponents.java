// Last updated: 7/31/2025, 5:32:57 PM
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
    public int numComponents(ListNode head, int[] nums) {
        int n=0;
        ListNode rt =head;
        while(rt!=null){
            rt = rt.next;
            n++;
        }
        int[] s =  new int[n];
        rt =head;
        int i=0;
        while(rt!=null){
            s[rt.val]=i;
            i++;
            rt = rt.next;
        }
        for(int i1=0; i1<nums.length; i1++){
            nums[i1]=s[nums[i1]];
        }
        Arrays.sort(nums);
        int c=1;
        for(int i1=0; i1<nums.length-1; i1++){
            if(nums[i1+1]-nums[i1]!=1){
                c++;
            }
        }
        return c;


    }
}