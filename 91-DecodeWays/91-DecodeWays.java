// Last updated: 10/6/2025, 7:23:33 PM
class Solution {
    public int numDecodings(String s) {
        int[] dp= new int[s.length()+1];
        Arrays.fill(dp,-1);
        int ans=helper(s,0,dp);
        return ans;
        
        
    }
    public int helper(String s,int i, int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int ans=0;
        if(s.charAt(i)=='0'){
            return 0;
        }
        ans+=helper(s,i+1,dp);
        if(s.length()-i>=2 && Integer.parseInt(s.substring(i,i+2))<=26){
            ans+=helper(s,i+2,dp);
        }
        return dp[i]=ans;
    }
}