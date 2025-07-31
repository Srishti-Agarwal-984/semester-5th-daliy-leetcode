// Last updated: 7/31/2025, 5:27:10 PM
class Solution {
    public String getEncryptedString(String s, int k) {
        char o, l;
        if(k>=s.length()){
           k=(k%(s.length()));

           if(k==0){
            return s;
           }
        }
        String sr="";
        String y="";
        int u=s.length();
        sr = s.substring(k,u);
        y = s.substring(0,k);
        s = sr + y;
        return s;
        
    }
}