// Last updated: 7/31/2025, 5:31:54 PM
class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        int i=3;
        int n1=0, n2=1, n3=0, n4 =1;
        while(i<=n){
            n3 = n2+n1+n4;
            n1 = n2;
            n2 = n4;
            n4 = n3;
            i++;
            
        }
        return n3;
        
    }
}