// Last updated: 10/18/2025, 7:32:35 AM
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp=new int[s.length()+1][p.length()+1];

        return matchHelper(s, p, 0, 0,dp);
    }

    public boolean matchHelper(String s, String p, int i, int j,int[][] dp) {
        // If both strings are consumed
        if (j == p.length()) return i == s.length();
        if(dp[i][j]!=0){
            return dp[i][j]==1;
        }

        // Check if next char in pattern is '*'
        boolean nextIsStar = (j + 1 < p.length() && p.charAt(j + 1) == '*');

        if (nextIsStar) {
            // Try 0 occurrence OR 1+ occurrences
            if (matchHelper(s, p, i, j + 2,dp)){
                dp[i][j]=1;
                return true; // skip "x*"

            } 
            if (i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i))) {
                dp[i][j]=matchHelper(s, p, i + 1, j,dp)?1:-1;
                return dp[i][j]==1; // use one char and stay
            }
            dp[i][j]=-1;
            return false;
        } else {
            // Match single character
            if (i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i))) {
                dp[i][j]=matchHelper(s, p, i + 1, j + 1,dp)?1:-1;
                return dp[i][j]==1;
            }
             dp[i][j]=-1;
            return false;
        }
    }
}
