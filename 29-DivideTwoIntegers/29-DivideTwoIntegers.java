// Last updated: 7/31/2025, 5:38:24 PM
class Solution {
    public int divide(int dividend, int divisor) {
        int a;
        if(dividend==-2147483648 && divisor==-1 ){
            return 2147483647;
        }
        a=(dividend/divisor);
        return a;
        
    }
}