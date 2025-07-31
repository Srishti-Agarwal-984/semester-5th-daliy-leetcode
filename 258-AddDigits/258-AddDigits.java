// Last updated: 7/31/2025, 5:35:32 PM
class Solution {
    public int addDigits(int num) {
        int s=0, d;
        int p;
        while(num!=0){
            d=num%10;
            s=s+d;
            num=num/10;
            if(num==0){
                num=s;
                s=0;
                System.out.println(num);
                if(num<=9){
                    break;
                }
            }
        }
        return num;   
    }
}