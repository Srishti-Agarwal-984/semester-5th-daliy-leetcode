// Last updated: 7/31/2025, 5:34:15 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        String a = new String();
        int y=0;
        for(int g = s.length()-1; g>=0; g--){
            if(s.charAt(g) != '-' && y!=k){
                char h1 = s.charAt(g);
                if(h1>=97){
                    // int h = s.charAt(g)-32;
                    h1 = (char)(h1-32);
                    
                }
                a = h1+a;
                
                y++;
            }
            if(y==k && g!=0){
                y=0;
                a="-"+a;
            }
        }
        if( a.length()>=1 && a.charAt(0)=='-'){
            return "AA-AA";
        }
        
        
        return a;
        
    }
}