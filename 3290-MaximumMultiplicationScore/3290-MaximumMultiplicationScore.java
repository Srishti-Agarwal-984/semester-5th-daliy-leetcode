// Last updated: 9/21/2025, 5:48:49 AM
class Solution {
    public long maxScore(int[] a, int[] b) {
        long[][] dp = new long[a.length][b.length];
        for(long[] ac: dp){
            Arrays.fill(ac, Long.MIN_VALUE);
        }
        long ans= helper(dp, a, b, 0,0);
        return ans;
    }
    public long helper(long[][] dp, int[] a, int[] b,int i, int j ){
        if(i==a.length){
            return 0;
        }
        if(j==b.length){
            return Long.MIN_VALUE/2l;
        }
        if(dp[i][j]!=Long.MIN_VALUE){
            return dp[i][j];
        }
        long inc =(long) a[i]*b[j]+helper(dp, a, b, i+1,j+1);
        long exc = helper(dp, a, b, i,j+1);
        return dp[i][j]=Math.max(inc, exc);
    }
}