// Last updated: 7/31/2025, 5:27:08 PM
class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int y=3,e=4,n=1,m=2,k=0;
        int s=red +blue;
        if (s==0){
            return 0;
        }
        if (s==1 || s==2){
            return 1;
        }
        while (n<=red && m<=blue)
        {
            k=k+1;
            n=n+y;
            y=y+2;
            m=m+e;
            e=e+2;
        }
        int h=k*2;
        if (red>=(n)){
            h=h+1;
        }
        int p=1,l=3,o=0,f=4,g=2;
        while(p<=blue && g<=red){
            o=o+1;
            p=p+l;
            l=l+2;
            g=g+f;
            f=f+2;
        }
        int w=o*2;
        if (blue>=(p)){
            w=w+1;
        }
        if (w>=h){
            return w;
        }
        else{
            return h;
        }    
    }
}