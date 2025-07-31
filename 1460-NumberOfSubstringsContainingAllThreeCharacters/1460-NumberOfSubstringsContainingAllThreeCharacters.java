// Last updated: 7/31/2025, 5:31:13 PM
class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int i=0;
        int ans=0;
        int si=0;
        while(i<s.length()){
            freq[s.charAt(i)-'a']++;
            while(freq[0]>=1 && freq[1]>=1 && freq[2]>=1 && si<=i){
                ans+=s.length()-i;
                freq[s.charAt(si)-'a']--;
                si++;
            }
            i++;
        }
        return ans;
    }
}