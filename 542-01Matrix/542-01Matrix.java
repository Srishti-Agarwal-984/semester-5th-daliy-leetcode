// Last updated: 7/31/2025, 5:33:54 PM
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]!=0){
                    ans[i][j]=mat.length+mat[0].length;
                }
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(ans[i][j]!=0){
                    if(i>0){
                        ans[i][j] = Math.min(ans[i][j],ans[i-1][j]+1);
                    }
                    if(j>0){
                        ans[i][j] = Math.min(ans[i][j],ans[i][j-1]+1);
                    }
                }

            }
        }
        for(int i=mat.length-1; i>=0; i--){
            for(int j=mat[0].length-1; j>=0; j--){
                if(ans[i][j]!=0){
                    if(i<mat.length-1){
                        ans[i][j] = Math.min(ans[i][j],ans[i+1][j]+1);
                    }
                    if(j<mat[0].length-1){
                        ans[i][j] = Math.min(ans[i][j],ans[i][j+1]+1);
                    }
                }

            }
        }
        return ans;
    }
}