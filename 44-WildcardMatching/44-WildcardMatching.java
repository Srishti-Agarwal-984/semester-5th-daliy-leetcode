// Last updated: 10/18/2025, 4:47:38 PM
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp= new int[s.length()+1][p.length()+1];
       return helper(s,p,0,0,dp);
        
        
    }
    public boolean helper(String s, String p,int i1,int i2,int[][] dp){
        if(i2>=p.length()){
            return i1==s.length();
        }
        if(dp[i1][i2]!=0){
            return dp[i1][i2]==1;
        }

        boolean a=p.charAt(i2)=='*';
        if(a){
            boolean ans=false;
            if(i1<s.length()){
                ans=ans||helper(s,p,i1+1,i2+1,dp);
                ans=ans||helper(s,p,i1+1,i2,dp);
            }
            ans=ans||helper(s,p,i1,i2+1,dp);
            dp[i1][i2]=ans?1:-1;
            return ans;
        }
        if(i1<s.length() && (s.charAt(i1)==p.charAt(i2) || p.charAt(i2)=='?')){
            boolean ans=false;
            ans=ans||helper(s,p,i1+1,i2+1,dp);
            dp[i1][i2]=ans?1:-1;
            return ans;
        }
        dp[i1][i2]=-1;
        return false;

    }
}