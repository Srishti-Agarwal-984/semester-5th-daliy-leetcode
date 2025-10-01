// Last updated: 10/1/2025, 5:45:31 PM
class Solution {
    public int longestString(int x, int y, int z) {
        if(y==x){
            int ans = y+x+z;
            return ans*2;
        }
        if(y>x){
            y=x*2+1;
            int ans = y+z;
            return ans*2;
        }
        x=y*2+1;
        int ans= x+z;
       
        return ans*2;

        
    }
}