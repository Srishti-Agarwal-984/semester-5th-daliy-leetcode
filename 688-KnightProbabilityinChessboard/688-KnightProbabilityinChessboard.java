// Last updated: 10/12/2025, 10:08:06 AM
class Solution {
    public double knightProbability(int n, int k, int row, int col) {
        if(k==0){
            return 1.0;
        }
        int[][] moves={{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,-2},{-1,2}};
        double[][][] dp = new double[n][n][k+1];
        for(double[][] a: dp){
            for(double[] l: a){
                Arrays.fill(l,-1.0);
            }
        }
        return helper(n,k,row,col,dp,moves);
        

    }
    public double helper(int n, int k, int row, int col, double[][][] dp,int[][] moves){
        if(row>=n || row<0 || col<0 || col>=n ){
            return 0;
        }
        if(k==0){
            return 1.0;
        }
        if( dp[row][col][k]!=-1.0){
            return  dp[row][col][k];
        }
        
        double ans=0.0;
        for(int i=0; i<8; i++){
            int cr = row+moves[i][0];
            int cc = col+moves[i][1];
            if(cr >= 0 && cc >= 0 && cr < n && cc < n){
                ans +=  helper(n,k-1,cr,cc,dp,moves);
            }
            
        }
       
        return dp[row][col][k]=(double) ans/8.0;


    }
}