// Last updated: 9/9/2025, 4:53:01 PM
class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[t.length()+1][s.length()+1];
        Arrays.fill(dp[0], 1);
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int inc=0, exc=0;
                if(t.charAt(i-1)==s.charAt(j-1)){
                    inc = dp[i-1][j-1];
                }
                exc = dp[i][j-1];
                dp[i][j]=exc+inc;

            }
        }
        return dp[dp.length-1][s.length()];

        
    }
}