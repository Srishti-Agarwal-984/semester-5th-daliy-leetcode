// Last updated: 7/31/2025, 5:33:22 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int y=n%2;
        n=n/2;
        while(n>0){
            int p=n%2;
            if(p==y){
                return false;
            }
            y=p;
            n=n/2;
        }
        return true;
        
    }
}