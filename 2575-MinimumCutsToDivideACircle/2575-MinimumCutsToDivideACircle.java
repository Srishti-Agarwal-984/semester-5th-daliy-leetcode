// Last updated: 7/31/2025, 5:28:24 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
        if(n%2!=0){
            return n;
        }
        return n/2;
    }
}