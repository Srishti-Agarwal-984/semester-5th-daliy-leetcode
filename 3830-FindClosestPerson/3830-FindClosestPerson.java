// Last updated: 7/31/2025, 5:26:03 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a =Math.abs(x-z);
        int b =Math.abs(y-z);
        if(a==b){
            return 0;
            
        }
        if(a>b){
            return 2;
            
        }
        return 1;
        
        
    }
}