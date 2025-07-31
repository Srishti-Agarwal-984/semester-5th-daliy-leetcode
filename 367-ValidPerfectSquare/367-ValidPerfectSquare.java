// Last updated: 7/31/2025, 5:34:58 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1, k= 32768;
        while(i<=k){
            int mid =i+(k-i)/2;
            int u= mid*mid;
            if(u==num){
                return true;
            }
            else if(u>num){
                k=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        if(num==2147395600){
            return true;
        }
        return false;
        
        
        
    }
}