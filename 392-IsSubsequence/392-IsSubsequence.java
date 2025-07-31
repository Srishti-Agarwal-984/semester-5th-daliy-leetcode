// Last updated: 7/31/2025, 5:34:48 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p= s.length(), k=0;
        if(p==0){
            return true;
        }
        for(int i=0; i<t.length(); i++){
            char s1 = t.charAt(i);
            char s2 = s.charAt(k);
            if(s1 == s2){
                k++;
               
            }
            if(k==p){
                return true;
            }
        }
        return false;
        
    }
}