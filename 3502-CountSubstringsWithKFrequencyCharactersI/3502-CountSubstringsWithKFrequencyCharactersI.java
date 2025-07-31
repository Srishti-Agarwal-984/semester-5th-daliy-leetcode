// Last updated: 7/31/2025, 5:26:58 PM
class Solution {
    public int numberOfSubstrings(String s, int k) {
        int[] freq = new int[26];
        int i=0, si=0,ans=0;
        int r = s.length();
        while(i<s.length()){
            freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>=k && si<=i){
                ans+=r-i;
                freq[s.charAt(si)-'a']--;
                si++;
            }
            i++;
        }
        return ans;
    }
}