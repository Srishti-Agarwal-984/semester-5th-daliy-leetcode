// Last updated: 10/30/2025, 11:41:38 AM
class Solution {
    int mod = 1000000007;
    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp = new int[4002][k+1];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        return numberOfWays1(startPos, endPos, k, dp);

    }
    public int numberOfWays1(int startPos, int endPos, int k,int[][] dp) {
        if(startPos==endPos && k==0){
            return 1;
        }
        if(k==0){
            return 0;
        }
        if(dp[startPos+1000][k]!=-1){
            return dp[startPos+1000][k];
        }
        int ans = numberOfWays1(startPos+1, endPos, k-1,dp)%mod;
        int ans1 = numberOfWays1(startPos-1, endPos, k-1,dp)%mod;
        return dp[startPos+1000][k] = (ans+ans1)%mod;

    }
    
}