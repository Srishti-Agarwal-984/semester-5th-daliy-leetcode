// Last updated: 7/31/2025, 5:30:33 PM
class Solution {
    public int maxDepth(String s) {
        int r=0;
        int ans=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                r++;
                ans=Math.max(ans, r);
            }
            else if(s.charAt(i)==')'){
                r--;
            }
        }
        return ans;
    }
}