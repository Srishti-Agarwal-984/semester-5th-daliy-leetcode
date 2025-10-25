// Last updated: 10/25/2025, 11:49:58 PM
class Solution {
    public String lexSmallest(String s) {
        String ans = s;
        for(int j=1; j<s.length()+1; j++){
            StringBuilder sb = new StringBuilder(s.substring(0, j));
            sb.reverse();
            sb.append(s.substring(j));
            if(ans.compareTo(sb.toString())>0){
                ans = sb.toString();
            }
        }
        for(int j=0; j<s.length(); j++){
            
            StringBuilder sb = new StringBuilder(s.substring(j,s.length()));
            sb.reverse();
            if(ans.compareTo(s.substring(0,j)+sb.toString())>0){
                ans = s.substring(0,j)+sb.toString();
            }
        }
        return ans;

    }
}