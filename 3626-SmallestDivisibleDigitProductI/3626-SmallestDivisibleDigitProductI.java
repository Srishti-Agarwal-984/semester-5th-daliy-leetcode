// Last updated: 7/31/2025, 5:26:42 PM
class Solution {
    public int smallestNumber(int n, int t) {
        int p=1;
        int k = n;
        while(n!=0){
            int y=n%10;
            if(y%t==0){
                return k;
            }
            p=p*(n%10);
            n=n/10;
        }
        if(p%t==0){
            return k;
        }
        k=k+1;
        while(true){
            int mid = k;
            if(ans(mid,t)){
                return k;
            }
            k++;
            
            
        }
        
    }
    public static boolean ans(int u, int ta){
        int po=1;
        while(u!=0){
            int y= u%10;
            if(y%ta==0){
                return true;
            }
            po=po*y;
            u=u/10;
        }
        if(po%ta==0){
            return true;
        }
        return false;
    }
}