// Last updated: 9/9/2025, 3:58:14 PM
class Solution {
    public int maxUncrossedLines(int[] text1, int[] text2) {
        int[][] dp = new int[text1.length][text2.length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        int r = helper(dp, text1, text2, 0, 0);
        return r;
    }
    public int helper(int[][] dp, int[] text1, int[] text2, int i, int j){
        if(i>=text1.length || j>=text2.length){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(text1[i]== text2[j]){
            ans=helper(dp, text1, text2, i+1, j+1)+1;
        }
        else{
            int n = helper(dp, text1, text2, i+1, j);
            int m = helper(dp, text1, text2, i, j+1);
            ans=Math.max(n,m);

        }
        return dp[i][j]=ans;
    }
}