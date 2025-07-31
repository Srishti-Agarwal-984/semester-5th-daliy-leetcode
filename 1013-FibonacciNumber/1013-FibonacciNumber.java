// Last updated: 7/31/2025, 5:32:27 PM
class Solution {
    public int fib(int n) {
        int a=0,b=1;
        if (n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        int s=0;
        for(int i=2;i<=n;i=i+1){
            s=a+b;
            a=b;
            b=s;
        }
        return s;
    }
}