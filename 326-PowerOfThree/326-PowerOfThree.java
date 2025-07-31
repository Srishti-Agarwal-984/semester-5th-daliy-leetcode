// Last updated: 7/31/2025, 5:35:15 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(ans(n)==-1){
            return false;
        }
        return true;

        
        
    }
    public static int ans(int n){
        if(n==1){
            return 0;
        }
        if(n%3!=0){
            return -1;
        }
        
        return ans(n/3);

    }
        
}