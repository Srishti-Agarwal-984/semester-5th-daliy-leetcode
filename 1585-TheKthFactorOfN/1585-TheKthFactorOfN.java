// Last updated: 7/31/2025, 5:30:49 PM
class Solution {
    public int kthFactor(int n, int k) {
        int p=1;
        while(k>0 && p<=n){
            if(n%p==0){
                k--;
            }
            p++;
        }
        if(k>0){
            return -1;
        }
        return p-1;

        
    }
}