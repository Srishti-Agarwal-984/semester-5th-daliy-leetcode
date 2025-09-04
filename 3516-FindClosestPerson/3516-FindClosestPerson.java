// Last updated: 9/5/2025, 5:25:59 AM
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