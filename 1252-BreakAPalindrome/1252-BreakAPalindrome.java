// Last updated: 7/31/2025, 5:31:48 PM
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        int c=0;
        for(int i=0; i<palindrome.length(); i++){
            if(palindrome.charAt(i)!='a'){
                String k1=palindrome.substring(0,i)+'a'+palindrome.substring(i+1,palindrome.length());
                boolean k= ans(k1);
                if(!k){
                    return k1;
                }
            }
        }
        return palindrome.substring(0,palindrome.length()-1)+'b';


        
    }
    public static boolean ans(String u){
        int g=0, l=u.length()-1;
        while(g<=l){
            if(u.charAt(g)!=u.charAt(l)){
                return false;
            }
            g++;
            l--;
        }
        return true;
    }
}