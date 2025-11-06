// Last updated: 11/6/2025, 6:09:55 AM
class Solution {
    public boolean winnerSquareGame(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return winnerSquareGame1(n,dp);
    }
    public boolean winnerSquareGame1(int n,int[] dp) {
        if(n==0){
            return false;
        }
        if(dp[n]!=-1){
            return dp[n]==0?false:true;
        }
        boolean ans=false;
        int i=1;
        while((i*i)<=n){
            boolean u=winnerSquareGame1(n-(i*i),dp);
            if(u==false){
                ans=true;
                dp[n]=1;
                return ans;
            }
            i++;
        }
        dp[n]=ans?1:0;
        return ans;
    }
}