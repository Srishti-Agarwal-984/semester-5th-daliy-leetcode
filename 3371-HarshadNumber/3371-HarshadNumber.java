// Last updated: 7/31/2025, 5:27:31 PM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int b=x;
        int s=0;
        int d;
        while(x!=0){
            d=x%10;
            s=s+d;
            x=x/10;
        }
        if(b%s==0){
            return s;
        }
        else{
            int f=-1;
            return f;
        }
        
    }
}