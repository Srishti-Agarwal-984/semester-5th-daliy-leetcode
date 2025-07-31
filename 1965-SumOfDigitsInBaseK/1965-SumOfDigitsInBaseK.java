// Last updated: 7/31/2025, 5:30:04 PM
class Solution {
    public int sumBase(int n, int k) {
        int j=0,l=0;
        int p;
        while(n!=0){
            p=n%k;
            j=j+p;
            n = n/k;
        }
        return j;
        
    }
}