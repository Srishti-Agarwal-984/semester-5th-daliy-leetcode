// Last updated: 10/16/2025, 11:17:22 PM
class Solution {
    int mod = 1000000007;
    public int numMusicPlaylists(int n, int goal, int k) {
        long[][] dp =new long[goal+1][n+1];
        for(long[] a: dp){
            Arrays.fill(a,-1l);
        }
        return (int)helper(n, goal, k, 0, 0,dp);

    }
    public long helper(int n, int goal, int k, int cn, int unc,long[][] dp){
        if(cn==goal){
            if(unc==n){
                return 1;
            }
            return 0;
        }
        if(dp[cn][unc]!=-1){
            return dp[cn][unc];
        }
        long unique =0l;
        if(unc<n){
            unique=( (n-unc)*helper(n, goal, k,cn+1,unc+1,dp)%mod)%mod;
        }
        long repeat = 0;
        if(unc>k){
            repeat = ((unc-k)*helper(n, goal, k,cn+1,unc,dp)%mod)%mod;
        }
        
        return dp[cn][unc]=(unique+repeat)%mod;

    }
    
}