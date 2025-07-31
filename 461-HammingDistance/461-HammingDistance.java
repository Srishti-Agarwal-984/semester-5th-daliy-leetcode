// Last updated: 7/31/2025, 5:34:22 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int u= x^y;
        int p=0;
        while(u>0){
            if(u%2==1){
                p++;
            }
            u=u/2;
        }
        return p;
        
        
    }
}