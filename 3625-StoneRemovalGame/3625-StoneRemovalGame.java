// Last updated: 7/31/2025, 5:26:43 PM
class Solution {
    public boolean canAliceWin(int n) {
        int g=10, l=0;
        while(n!=0){
            int h=n-g;
            if(h<0){
                break;
            }
            else{
                l++;
            }
            n=n-g;
            g--;
        }
        if(l%2==0){
            return false;
        }
        return true;
        
    }
}