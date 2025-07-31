// Last updated: 7/31/2025, 5:29:53 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.indexOf(part)>=0){
            int i = s.indexOf(part);
            int p= part.length();
            s=s.substring(0,i)+s.substring(p+i,s.length());
        }
        return s;
        
    }
}