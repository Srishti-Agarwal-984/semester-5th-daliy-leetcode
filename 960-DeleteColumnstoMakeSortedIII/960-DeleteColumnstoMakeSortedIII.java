// Last updated: 11/15/2025, 5:16:15 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<strs[0].length(); i++){
           int[][] dp = new int[strs[0].length()][strs[0].length()];
            for(int[] a:dp){
                Arrays.fill(a, -1);
            }
            ans=Math.min(ans, helper(strs, i, i,dp)+i);
        }
        
        return ans;
    }
    public int helper(String[] strs, int p, int i,int[][] dp ){
        if(i>=strs[0].length()){
            return 0;
        }
        if(dp[p][i]!=-1){
            return dp[p][i];
        }
        int c=0;
        for(String s: strs){
            if(s.charAt(p)>s.charAt(i)){
                c++;
                break;
            }
        }
        int inc=1000000, exc=1000000;
        if(c==0){
            inc=helper(strs, i, i+1,dp);
        }
        exc=1+helper(strs, p, i+1,dp);
        return dp[p][i]=Math.min(inc, exc);

    }
}