// Last updated: 7/31/2025, 5:31:00 PM
class Solution {
    public int maxDiff(int num) {
        int a = -1;
        int b=-1;
        int c1=-1;
        int temp = num;
        while(num!=0){
            if(num%10!=1 && num%10!=0){
                a=num%10;
            }
            if(num%10!=9){
                c1=num%10;
            }
            b=num%10;
            num/=10;
        }
        // System.out.println(a);
        int c=0;
        int r = 0;
        int q = 0;
        num=temp;
        while(num!=0){
            if(b!=a && num%10==a){
                q=(int)(q+Math.pow(10,c)*0);
            }
            else if(b==a&& num%10==a){
                q=(int)(q+Math.pow(10,c)*1);
            }
            else{
                q=(int)(q+Math.pow(10,c)*(num%10));
            }
            num=num/10;
            c++;
            
        }
        c=0;
        num=temp;
        while(num!=0){
            if(b==c1 && num%10==c1 ){
                r=(int)(r+Math.pow(10,c)*9);
            }
            else if(b!=c1 && num%10==c1){
                r=(int)(r+Math.pow(10,c)*9);
            }
            else{
                r=(int)(r+Math.pow(10,c)*(num%10));
            }
            num=num/10;
            c++;
            
        }
        return r-q;

    }
}