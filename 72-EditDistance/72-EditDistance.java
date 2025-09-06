// Last updated: 9/7/2025, 12:09:57 AM
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] a: dp){
            Arrays.fill(a,-1);
        }
        int r=helper(word1, word2, 0, 0,dp);
        return r;
    }
    public int helper(String word1, String word2, int i, int j, int[][]dp){
        if(i==word1.length() && j==word2.length()){
            return 0;
        }
        if(i>=word1.length() || j>=word2.length()){
            return Math.max(word1.length()-i, word2.length()-j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;

        if(word1.charAt(i)==word2.charAt(j)){
            ans=helper(word1, word2, i+1, j+1,dp);
        }
        else{
            int p1=helper(word1, word2, i+1, j,dp)+1;
            int p2=helper(word1, word2, i, j+1,dp)+1;
            int p3=helper(word1, word2, i+1, j+1,dp)+1;
            ans=Math.min(p1, Math.min(p2,p3));
        }
        return dp[i][j]=ans;
    }
}