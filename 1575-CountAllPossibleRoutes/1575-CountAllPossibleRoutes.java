// Last updated: 10/12/2025, 8:57:09 AM
class Solution {
    int mod = 1000000007;
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int[][] dp = new int[locations.length][fuel+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(locations,  start,  finish,fuel,dp);

    }
    public int helper(int[] locations, int start, int finish, int fuel,int[][] dp){
        if(dp[start][fuel]!=-1){
            return dp[start][fuel];
        }
    
        int ans=0;
        if(start==finish){
            ans++;
        }
        for(int i=0; i<locations.length; i++ ){
            if(start!=i && Math.abs(locations[start]-locations[i])<=fuel ){
                ans= (ans%mod+helper( locations,  i,  finish,fuel-Math.abs(locations[start]-locations[i]),dp)%mod)%mod;
            }
        }
        dp[start][fuel]=ans;
        return ans; 
    }
}