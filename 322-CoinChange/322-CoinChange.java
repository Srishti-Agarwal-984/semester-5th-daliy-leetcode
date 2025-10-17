// Last updated: 10/17/2025, 11:18:40 AM
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = helper(coins, amount,dp);
        return ans==100000000?-1: ans;
    }
    public int helper(int[] coins, int amount,int[] dp){
        if(amount==0){
            return 0;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int ans= 100000000;
        for(int i=0; i<coins.length; i++){
            int p  =0;
            if(coins[i]<=amount){
                p=p+helper(coins, amount-coins[i],dp)+1;
                ans = Math.min(ans, p);
            }
        }
        return dp[amount]=ans;

    }

}