// Last updated: 10/4/2025, 9:33:25 PM
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=helper(dp,n);
        return ans;
    }
    public int helper(int[] dp, int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=0;
        ans=ans+helper(dp,n-1)+helper(dp,n-2);
        return dp[n]=ans;
    }
}