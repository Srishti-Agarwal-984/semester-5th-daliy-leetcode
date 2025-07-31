// Last updated: 7/31/2025, 5:26:29 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int c=1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                if(c==k){
                    return true;
                }
                c=1;
            }
        }
        if(c==k){
            return true;
        }
        return false;
        
    }
}