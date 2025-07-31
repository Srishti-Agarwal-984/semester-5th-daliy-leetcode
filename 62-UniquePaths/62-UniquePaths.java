// Last updated: 7/31/2025, 5:37:44 PM
class Solution {
    public int uniquePaths(int m, int n) {
        double a= m+n-2;
        double p=1, k=1 ,l=1;
        for(int i=1; i<=a; i=i+1){
            if( i<=m-1){
                p=1;
            }
            else{
                p=p*i;
            }
        }
        for(int d=1; d<=(n-1); d=d+1){
            l=l*d;
        }
        p=p/l;
        System.out.println(p);
        int r =(int)p;    
        return r;
    }
}