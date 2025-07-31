// Last updated: 7/31/2025, 5:28:18 PM
class Solution {
    public long coloredCells(int n) {
        long k=1;
        int c=1;
        while(n!=1){
            k=k+(c)*4;
            c++;
            n--;

        }
        return k;
        
    }
}