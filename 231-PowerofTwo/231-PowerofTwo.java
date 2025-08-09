// Last updated: 8/10/2025, 12:06:35 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }

        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
        
    }
    // public static boolean po(int n){

    // }
}