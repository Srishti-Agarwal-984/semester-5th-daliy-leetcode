// Last updated: 7/31/2025, 5:37:49 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] as = new int[n][n];
        int ri =0, ci=0, rp = n-1, cp = n-1;
        int c=0;
        int m = n*n;
        while(c<m){
            for(int i =ci; i<=cp && c<m; i++){
                as[ri][i] = c+1;
                c++;
            }
            ri++;
            for(int i =ri; i<=rp && c<m; i++){
                as[i][cp]=c+1;
                c++;
            }
            cp--;
            for(int i =cp; i>=ci && c<m; i--){
                as[rp][i]=c+1;
                c++;
            }
            rp--;
            for(int i =rp; i>=ri && c<m; i--){
                as[i][ci]=c+1;
                c++;
            }
            ci++;

        }
        return as;
        
        
    }
}