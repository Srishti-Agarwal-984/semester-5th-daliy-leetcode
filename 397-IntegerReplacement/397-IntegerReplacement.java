// Last updated: 7/31/2025, 5:34:45 PM
class Solution {
    public int integerReplacement(int n) {
        if(n==2147483647){
            n=n-1;
        }
        int c=0;
        int u= ans(n,c);
        return u;
        
        
    }
    public static int ans(int n, int c){
        if(n==1){
            return c;
        }
        if(n%2==0){
            return ans(n/2, c+1);
        }
        int a = Math.min(ans(n-1,c+1),ans(n+1,c+1));
        return a;
    }
}