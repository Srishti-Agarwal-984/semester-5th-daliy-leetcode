// Last updated: 7/31/2025, 5:29:02 PM
class Solution {
    public boolean digitCount(String num) {
        int[] as= new int[num.length()];
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)-'0'<num.length()){
                as[num.charAt(i)-'0']++;
            }
        }
        for(int i=0; i<num.length(); i++){
            if(as[i]!=(num.charAt(i)-'0')){
                return false;
            }
        }
        return true;

        
    }
}