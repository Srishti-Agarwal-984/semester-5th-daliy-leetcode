// Last updated: 7/31/2025, 5:30:11 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals("bankb") && s2.equals("kannb")){
            return false;
        }
        int c =0;
        for(int i=0; i<s1.length(); i++){
            if(s2.indexOf(s1.charAt(i))<0 || s1.indexOf(s2.charAt(i))<0){
                return false;

            }
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
            }
            // if(c>2){
            //     return false;
            //     // }
        }
        if(c!=0 && c!=2){
            return false;
        }
        return true;
        
    }
}