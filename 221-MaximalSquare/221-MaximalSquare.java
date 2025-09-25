// Last updated: 9/25/2025, 7:31:54 PM
class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int qw=0;
        for(int i=0; i<matrix[0].length; i++){
            ans[0][i]=matrix[0][i]-'0';
            qw=Math.max(qw, ans[0][i]);
        }
        for(int i=0; i<matrix.length; i++){
            ans[i][0]=matrix[i][0]-'0';
            qw=Math.max(qw, ans[i][0]);
        }
        //int qw=0;

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<ans[0].length; j++){
                if(matrix[i][j]=='0'){
                    continue;
                }
                ans[i][j]=Math.min(ans[i-1][j-1], Math.min(ans[i][j-1], ans[i-1][j]))+1;
                qw=Math.max(qw,ans[i][j]*ans[i][j]);
            }
        }
        return qw;
        
    }
}