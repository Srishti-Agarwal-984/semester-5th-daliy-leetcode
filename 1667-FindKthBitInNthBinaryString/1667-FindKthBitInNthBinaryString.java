// Last updated: 7/31/2025, 5:30:40 PM
class Solution {
    public char findKthBit(int n, int k) {
        char ans = helper(n, k);
        return ans;

        
    }
    public static char helper(int n, int k){
        if(n==1){
            return '0';
        }
        int sl = (int)(Math.pow(2,n))-1;
        int u = (sl+1)/2;
        if(k==u){
            return '1';
        }
        if(k<u){
            return helper(n-1, k);
        }
        return helper(n-1, sl-k+1)=='0'?'1':'0';
    
    }
}