// Last updated: 7/31/2025, 5:30:51 PM
class Solution {
    public int maxVowels(String s, int k) {
        int cn=0;
        int ans =0;
        for(int i=0; i<k; i++){
            if("aeiou".indexOf(s.charAt(i))>=0){
                cn++;
            }
        }
        ans = cn;
        for(int i=k; i<s.length(); i++){
            if("aeiou".indexOf(s.charAt(i-k))>=0){
                cn--;
            }
            if("aeiou".indexOf(s.charAt(i))>=0){
                cn++;
                ans  =  Math.max(cn ,ans);
            }
        }
        return ans;
    }
}