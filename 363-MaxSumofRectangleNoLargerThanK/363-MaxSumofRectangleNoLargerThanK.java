// Last updated: 1/23/2026, 1:55:09 PM
1class Solution {
2    public int maxSumSubmatrix(int[][] matrix, int k) {
3        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
4        for(int i=0; i<matrix.length; i++){
5            for(int j=0; j<matrix[0].length; j++){
6                dp[i+1][j+1] = dp[i+1][j]+dp[i][j+1]-dp[i][j]+matrix[i][j];
7            }
8        }
9
10        int ans=Integer.MIN_VALUE;
11        for(int i=matrix.length; i>=1; i--){
12            for(int j=matrix[0].length; j>=1; j--){
13                ans= Math.max(ans, helper(matrix, k, i, j, dp));
14            }
15        }
16        return ans;
17        
18    }
19    public int helper(int[][] matrix, int k, int r, int c, int[][] dp){
20        int ans=Integer.MIN_VALUE;
21        for(int i=r; i<=matrix.length; i++){
22            for(int j=c; j<=matrix[0].length; j++){
23                int u= dp[i][j]-dp[i-r][j]-dp[i][j-c]+dp[i-r][j-c];
24                if(u<=k){
25                    ans= Math.max(ans, u);
26                }
27            }
28        }
29        return ans;
30    }
31}