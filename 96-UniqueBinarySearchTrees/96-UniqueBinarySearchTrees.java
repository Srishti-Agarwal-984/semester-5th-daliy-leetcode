// Last updated: 8/16/2025, 12:32:45 AM
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        return helper(dp,n);
    
    }
    public int helper(int[] dp, int n){
        if(dp[n]!=0){
            return dp[n];
        }
        int m=0;
        for(int i=1; i<=n; i++){
            int left = helper(dp, i-1);
            int right = helper(dp, n-i);
            m+=left*right;


        }
        dp[n]=m;
        return m;
    }
}