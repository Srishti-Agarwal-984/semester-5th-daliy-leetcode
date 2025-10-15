// Last updated: 10/15/2025, 5:05:30 PM
class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        int ans = helper(s, 0,s.length()-1 , dp);
        return ans;
        
    }
    public int helper(String s, int i,int j, int[][] dp){
        if(i>=s.length() || j<0){
            return 0;

        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans =0;
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=1+helper(s,i+1,j-1,dp);

        }
        int inc = helper(s, i+1, j,dp);
        int exc = helper(s, i,j-1,dp);
        return dp[i][j]= Math.max(exc, inc);
    }
}