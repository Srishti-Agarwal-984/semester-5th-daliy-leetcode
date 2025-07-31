// Last updated: 7/31/2025, 5:35:28 PM
class Solution {
    public boolean isUgly(int n) {
        int m=n;
        while (n>1){
            if(n%2==0){
                n=n/2;
            }
            else if(n%3==0){
                n=n/3;
            }
            else if(n%5==0){
                n=n/5;
            }
            else{
                return false;
            }
        }
        if(m<=0){
            return false;
        }
        return true;
    }
}