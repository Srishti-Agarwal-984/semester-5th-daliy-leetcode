// Last updated: 7/31/2025, 5:28:37 PM
class Solution {
    public int commonFactors(int a, int b) {
        int c=0, s;
        if(a>b){
            s=b;
        }
        else{
            s=a;
        }

        while(s!=0){
            if(a%s==0 && b%s==0){
                c=c+1;
            }
            s=s-1;
        }
        return c;
        
    }
}