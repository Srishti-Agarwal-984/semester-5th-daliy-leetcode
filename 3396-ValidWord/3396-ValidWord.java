// Last updated: 7/31/2025, 5:27:25 PM
class Solution {
    public boolean isValid(String word) {
        int v=0, c=0;
        for(int i=0; i<word.length(); i++){
            int d = word.charAt(i)-'0';
            int r = word.charAt(i)-'a';
            int r1 = word.charAt(i)-'A';
            if(d>=0 && d<=9){
                continue;

            }
            else if(r>=0 && r<=25){
                if(word.charAt(i)=='a' || word.charAt(i)=='e'|| word.charAt(i)=='i'|| word.charAt(i)=='o'||word.charAt(i)=='u' ){
                    v++;
                }
                else{
                    c++;
                }

            }
            else if(r1>=0 && r1<=25){
                if(word.charAt(i)=='A' || word.charAt(i)=='E'|| word.charAt(i)=='O'|| word.charAt(i)=='I'||word.charAt(i)=='U' ){
                    v++;
                }
                else{
                    c++;
                }

            }
            else{
                return false;
            }

        }
        if(v>=1 && c>=1 && word.length()>=3){
            return true;
        }
        return false;
    }
}