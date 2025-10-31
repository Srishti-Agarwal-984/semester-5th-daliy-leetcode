// Last updated: 10/31/2025, 12:37:15 PM
class Solution {
    int mod = 1000000007;
    int[] x = {1,-1,2,2,-2,-2,-1,1};
    int[] y = {2,2,-1,1,-1,1,-2,-2}; 
    public int knightDialer(int n) {
        int[][][] dp = new int[n+1][4][3];
        for(int[][] a: dp){
            for(int[] b: a){
                Arrays.fill(b, -1);
            }
        }
        int ans =0;
        char[][] arr = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'.','0','.'}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]!='.'){
                    ans= (ans +helper(i,j,arr, n-1,dp)%mod)%mod;
                }
            }
        }
        return ans;  
    }
    public int helper( int row, int col , char[][] arr, int n,int[][][]dp){
        if(row>=4 || col>=3 || row<0 || col<0 || arr[row][col]=='.'){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n][row][col]!=-1){
            return dp[n][row][col];
        }
        int ans=0;
        for(int i=0; i<x.length; i++){
            ans=(ans+helper(row+x[i], col+y[i], arr, n-1,dp)%mod)%mod;
        }
        return dp[n][row][col]=ans;
    }
}