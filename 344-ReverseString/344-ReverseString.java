// Last updated: 7/31/2025, 5:35:07 PM
class Solution {
    public void reverseString(char[] s) {
        int y=0, k=s.length-1;
        char d;
        while(y<=k){
            d=s[y];
            s[y] = s[k];
            s[k] = d;
            y=y+1;
            k=k-1;
        }
        
    }
}