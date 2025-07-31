// Last updated: 7/31/2025, 5:34:02 PM
class Solution {
    public boolean detectCapitalUse(String word) {

        int a =0;
        int b =0;
        for(int i=0; i<word.length(); i++){
            int c = word.charAt(i)-'A';
            if(c<26){
                a++;
            }
            else{
                b++;
            }
        }
        if(b==word.length() || a == word.length()){
            return true;
        }
        int u = word.charAt(0)-'A';
        if(b==word.length()-1 &&  u<26 ){
            return true;
        }
        return false;
    }
}