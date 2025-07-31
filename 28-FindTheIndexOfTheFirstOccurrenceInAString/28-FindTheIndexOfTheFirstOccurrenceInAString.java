// Last updated: 7/31/2025, 5:38:28 PM
class Solution {
    public int strStr(String haystack, String needle) {
        int g=0,k=0;
        int h=haystack.length();
        char p='e';
        char t='f';
        while(g<h)
        {
            p = haystack.charAt(g);
            t = needle.charAt(k);
            if (p == t){
                k=k+1;
            }
            else{
                g=g-k;
                k=0;
            }           
            if (k==needle.length()){
                return g-k+1;
            }
            g=g+1;
        }
        int y=-1;
        return y; 
    }
}