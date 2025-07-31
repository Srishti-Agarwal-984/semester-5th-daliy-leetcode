// Last updated: 7/31/2025, 5:30:14 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int y=word1.length();
        int w=word2.length();
        String p="";
        char j, m;
        if (y>w){
            for(int i=0; i<w; i=i+1){
                j = word1.charAt(i);
                m = word2.charAt(i);
                p=p+j+m;
            }
            p = p + word1.substring(w,y);
             
        }
        else{
            for(int i=0; i<y; i=i+1){
                j = word1.charAt(i);
                m = word2.charAt(i);
                p=p+j+m;
            }
            p = p + word2.substring(y,w);    
        }
        return p; 
    }
}