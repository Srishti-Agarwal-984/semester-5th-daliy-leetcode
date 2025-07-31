// Last updated: 7/31/2025, 5:26:57 PM
class Solution {
    public int minChanges(int n, int k) {
        if((n%2==0) && (k%2!=0))
        {
            int y=-1;
            return y;
        }
        int c=0, s=-1;
        int g,m;
        while(n>0 || k>0){
            g = n&1;
            m = k&1;
            if(g==1 && m==0){
                c=c+1;
            }
            if(g==0 && m==1){
                return s;
            }
            n=n>>1;
            k=k>>1;
        }
        return c;    
    }
}