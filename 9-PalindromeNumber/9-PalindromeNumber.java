// Last updated: 7/31/2025, 5:38:46 PM
class Solution {
    public boolean isPalindrome(int x) {
        int f=0,l, k=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            l=x%10;
            f=f*10+l;
            x=x/10;
        }
        if (f==k){
            return true;
        }
        else{
            return false;
        }

        
    }
}