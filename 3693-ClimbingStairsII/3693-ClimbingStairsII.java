// Last updated: 9/29/2025, 8:40:02 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp= new int[n+1];
        int ans=helper(dp, n,costs,0);
        return ans;
        
    }
    public int helper(int[] dp, int n, int[] costs, int i){
        if(i==n){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int a= helper(dp, n, costs, i+1)+costs[i]+1;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        if(n-i>=2){
            b= helper(dp, n, costs, i+2)+costs[i+1]+4;
        }
        if(n-i>=3){
            c= helper(dp, n, costs, i+3)+costs[i+2]+9;
        }
        dp[i]=Math.min(a,Math.min(b,c));
        return dp[i];
    }
}