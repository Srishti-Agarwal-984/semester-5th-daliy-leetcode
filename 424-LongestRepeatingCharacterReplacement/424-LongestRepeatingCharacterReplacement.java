// Last updated: 7/31/2025, 5:34:33 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int[] ans = new int[26];
        int si=0, max=0;
        int res=0;
        for(int i=0; i<s.length(); i++){
            ans[s.charAt(i)-'A']++;
            max=Math.max(max, ans[s.charAt(i)-'A']);
            if(i-si+1-max>k){
                ans[s.charAt(si)-'A']--;
                si++;

            }
            res = Math.max(res, i-si+1);
        }
        return res;
        
    }
}