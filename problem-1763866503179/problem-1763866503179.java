// Last updated: 11/23/2025, 8:25:03 AM
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long l=0;
        long p=1;
        
        while(n!=0){
            if(n%10==0){
                n=n/10;
                continue;
            }
            sum+=n%10;
            long u = n%10;
            u=u*p;
            l=l+u;
            p=p*10;
            n=n/10;  
        }
        return sum*l;
        
    }
}