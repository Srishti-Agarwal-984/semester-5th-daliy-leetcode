// Last updated: 7/31/2025, 5:38:49 PM
class Solution {
    public int reverse(int x) {
        int c=0;
        if(x<0){
            x*=-1;
            c=1;
        }
        long f=0;
        while(x>0){
            f=f*10+x%10;
            x/=10;
        }
        if(c==1){
            f*=-1;
        }
        if(f>2147483647 || f<-2147483648){
            return 0;
        }
        return (int)f;
        
    }
}