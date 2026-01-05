// Last updated: 1/5/2026, 12:09:50 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        int nn=0;
4        int min=Integer.MAX_VALUE;
5        long sum=0;
6        for(int i=0; i<matrix.length; i++){
7            for(int j=0; j<matrix[0].length; j++){
8                if(matrix[i][j]<0){
9                    nn++;
10                }
11                sum+=Math.abs(matrix[i][j]);
12                min = Math.min(min, Math.abs(matrix[i][j]));
13            }
14        }
15        if(nn%2==0){
16            return sum;
17        }
18        //System.out.println
19        return sum-min-min;
20        
21    }
22}