// Last updated: 7/31/2025, 5:26:55 PM
class Solution {
    public String losingPlayer(int x, int y) {
        int a=0;
        if(x<1 || y<4){
            return "Bob";
        }
        while(x>0 && y>3){
            x=x-1;
            y=y-4;
            a=a+1;    
        }
        if(a%2!=0){
            return "Alice";
        }
        else{
            return "Bob";
        }    
    }
}