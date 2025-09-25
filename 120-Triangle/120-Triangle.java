// Last updated: 9/25/2025, 7:16:43 PM
class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int[][] dp = new int[t.size()][t.get(t.size()-1).size()];
        for(int i=0; i<t.size(); i++){
            for(int j=0; j<t.get(t.size()-1).size(); j++){
                dp[i][j]=Integer.MAX_VALUE;

            }

        }
        if(t.size()==1){
            return t.get(0).get(0);
        }
        int ans = t.get(0).get(0)+ helper(t,1,1,dp);
        int ans1 = t.get(0).get(0)+ helper(t,1,0,dp);
        return Math.min(ans, ans1);
    }
    public static int helper(List<List<Integer>> t, int idx1, int idx2,int[][] dp){
        if(idx1>=t.size()){
            return 0;
        }
        if(dp[idx1][idx2]!=Integer.MAX_VALUE){
            return dp[idx1][idx2];
        }
        int r1 = helper(t,idx1+1,idx2+1,dp)+t.get(idx1).get(idx2);
        int r2 = helper(t,idx1+1,idx2,dp)+t.get(idx1).get(idx2);
        dp[idx1][idx2]=Math.min(r1,r2);
        return Math.min(r1,r2);

    }
}