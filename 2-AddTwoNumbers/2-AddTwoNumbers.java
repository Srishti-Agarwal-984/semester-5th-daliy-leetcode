// Last updated: 11/13/2025, 10:34:43 AM
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ar = new ListNode();
        ListNode tem=ar;
        int c=0;
        while(l1!=null && l2!=null){
            //ar=null;
            int sum = l1.val+l2.val+c;
            //ar.val=sum%10;
            if(sum>9){
                c=1;
            }
            else{
                c=0;
            }
           ListNode nn = new ListNode(sum%10);
           ar.next=nn;
           ar=ar.next;
           //ar=nn;
           l1=l1.next;
           l2=l2.next;
        
        }
        while(l1!=null){
            //ar=null;
            int sum = l1.val+c;
            //ar.val=sum%10;
            if(sum>9){
                c=1;
                
            }
            else{
                c=0;
            }
            ListNode nn = new ListNode(sum%10);
            ar.next=nn;
            ar=ar.next;
            l1=l1.next;
        
        }
        while(l2!=null){
            //ar=null;

            int sum = l2.val+c;

           // ar.val=sum%10;

            if(sum>9){

                c=1;
            }

            else{

                c=0;

            }

            ListNode nn = new ListNode(sum%10);

            ar.next=nn;

            ar=ar.next;
            

            l2=l2.next;

        }
        if(c==1){
            //ar=null;
            //ar.val=1;
            ListNode nn =new ListNode(1);
            ar.next=nn;
            ar=ar.next;

            //ar.va
        }
        return tem.next;
        
    
        
    }
}