// Last updated: 7/31/2025, 5:35:09 PM
class Solution {
    public int integerBreak(int n) {
        int p = 0;
        if(n<=6){
            p=ans(n);
            return p;
        }
        if(n%3==1){
            int a = n/3;
            p=(int)(Math.pow(3,a-1))*4;
            return p;
        }
        if(n%3==2){
            int a = n/3;
            p=(int)(Math.pow(3,a))*2;
            return p;
        }
        int a = n/3;
        p=(int)(Math.pow(3,a));

        return p;
        
        
    }
    public static int ans(int n){
        if(n<=2){
            return 1;
        }
        int r = (n+1)/2;
        int t = n/2;
        if(n>13){
            r = r-1;
            t = t+1;
        }
        int y = Math.max(r,ans(r));
        int x = Math.max(t,ans(t));
        return x*y;
    }

}