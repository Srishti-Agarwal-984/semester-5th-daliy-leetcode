// Last updated: 7/31/2025, 5:33:03 PM
class Solution {
    public int kthGrammar(int n, int k) {
        n=(int)(Math.pow(2, n-1));
        boolean ans = true;
        while(n!=1){
            n=n/2;
            if(k>n){
                k=k-n;
                ans = !ans;
            }

        }
        return (ans ? 0 : 1);
        
    }
    
}