// Last updated: 11/14/2025, 4:11:25 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=10;
        return helper(n, dp);

        
    }
    public int helper(int n, int[] dp){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        int ans= ((helper(n-1, dp)-helper(n-2, dp))*(11-n))+helper(n-1, dp);
        dp[n]=ans;
        return ans;

    }
}