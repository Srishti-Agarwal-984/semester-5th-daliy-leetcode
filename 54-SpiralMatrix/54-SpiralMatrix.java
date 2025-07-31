// Last updated: 7/31/2025, 5:37:55 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> as = new ArrayList<Integer>();
        int ri =0, ci=0, rp = matrix.length-1, cp = matrix[0].length-1;
        int c=0;
        int m = matrix.length*matrix[0].length;
        while(c<m){
            for(int i =ci; i<=cp && c<m; i++){
                as.add(matrix[ri][i]);
                c++;
            }
            ri++;
            for(int i =ri; i<=rp && c<m; i++){
                as.add(matrix[i][cp]);
                c++;
            }
            cp--;
            for(int i =cp; i>=ci && c<m; i--){
                as.add(matrix[rp][i]);
                c++;
            }
            rp--;
            for(int i =rp; i>=ri && c<m; i--){
                as.add(matrix[i][ci]);
                c++;
            }
            ci++;

        }
        return as;
        
    }
}