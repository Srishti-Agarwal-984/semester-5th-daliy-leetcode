// Last updated: 7/31/2025, 5:35:33 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] as= new int[26];
        for(int i=0; i<s.length(); i++){
            as[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            if(as[t.charAt(i)-'a']<=0){
                return false;

            }
            as[t.charAt(i)-'a']--;
        }
        return true;

        
    }
}