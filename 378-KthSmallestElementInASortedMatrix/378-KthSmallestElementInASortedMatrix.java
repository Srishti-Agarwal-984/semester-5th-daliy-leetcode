// Last updated: 7/31/2025, 5:34:55 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                ar.add(matrix[i][j]);
            }
        }
        Collections.sort(ar);
        return ar.get(k-1);
    }
}