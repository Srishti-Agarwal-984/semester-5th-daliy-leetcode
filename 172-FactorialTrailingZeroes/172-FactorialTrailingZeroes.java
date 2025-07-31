// Last updated: 7/31/2025, 5:36:12 PM
class Solution {
    public int trailingZeroes(int n) {
        int s=0;
        while(n!=0){
            s=s+n/5;
            n=n/5;
        }
        return s;
        
    }
}