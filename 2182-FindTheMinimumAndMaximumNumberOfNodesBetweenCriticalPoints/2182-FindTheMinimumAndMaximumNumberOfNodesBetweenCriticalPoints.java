// Last updated: 7/31/2025, 5:29:36 PM
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int c=0;
        ListNode a1 = head;
        while(a1!=null){
            a1=a1.next;
            c++;
        }
        int[] arr = new int[2];
        ListNode ar = head;
        arr[0]=-1;
        arr[2-1]=-1;
        int i=1;
        if(c<2){
            return arr;
        }
        ArrayList<Integer> are = new ArrayList<>();
        while(c>=3){
            int a = ar.val;
            int b = ar.next.val;
            int c1 = ar.next.next.val;
            if((b>a && b>c1) || (b<a && b<c1)){
                are.add(i);
            }
            i++;
            c--;
            ar=ar.next;

        }
        if(are.size()<2){
            return arr;
        }
        Collections.sort(are);
        arr[1]=are.get(are.size()-1)-are.get(0);
        for(int ip=0; ip<are.size()-1; ip++){
            int klp = are.get(ip+1)-are.get(ip);
            if(arr[0]==-1){
                arr[0]=klp;
            }
            arr[0]=Math.min(arr[0],klp);
        }
        return arr;


        
    }
}