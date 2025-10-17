// Last updated: 10/17/2025, 11:07:16 AM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()+1];
        boolean ans  = helper(s, wordDict,0,dp);
        return ans;
    }
    public boolean helper(String s, List<String> wordDict, int i,int[] dp){
        if(i>=s.length()){
            return true;
        }
        if(dp[i]!=0){
            return dp[i]==1;
        }
        boolean ans = false;
        for(int si = 0; si<wordDict.size(); si++){
            if(wordDict.get(si).length()<=s.length()-i && s.startsWith(wordDict.get(si), i)){
                ans = ans || helper(s,wordDict, i+wordDict.get(si).length(),dp);
                if(ans){
                    dp[i]=1;
                    return true;
                }
            }
            
            
        }
        dp[i]=ans?1:-1;
        return ans;
    }
}