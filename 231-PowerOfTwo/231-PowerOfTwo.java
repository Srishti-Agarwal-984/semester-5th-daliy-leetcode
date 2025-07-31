// Last updated: 7/31/2025, 5:35:41 PM
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