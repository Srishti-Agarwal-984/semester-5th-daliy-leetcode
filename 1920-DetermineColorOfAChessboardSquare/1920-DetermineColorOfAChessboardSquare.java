// Last updated: 7/31/2025, 5:30:10 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int y=coordinates.charAt(0)-'a';
        int h= coordinates.charAt(1)-'1';
        if(y%2!=0 && h%2==0){
            return true;
        }
        if(y%2==0 && h%2!=0){
            return true;
        }
        return false;
        
    }
}