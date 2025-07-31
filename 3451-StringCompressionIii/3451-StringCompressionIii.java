// Last updated: 7/31/2025, 5:27:17 PM
class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int c =0;
        int i=0;
        for(i=0; i<word.length()-1; i++){
            if(word.charAt(i) == word.charAt(i+1) && c<8){
                c++;
            }
            else{
                sb.append(c+1);
                sb.append(word.charAt(i));
                c=0;
            }
        }
        sb.append(c+1);
        sb.append(word.charAt(i));
        return sb.toString();
        
    }
}