// Last updated: 7/31/2025, 5:36:14 PM
class Solution {
    public int titleToNumber(String s) {
        int ans=0;
        for(int i=0;i<s.length(); i++){
            ans=ans*26+s.charAt(i)-'A'+1;
        }
        return ans;
        
        
    }
}