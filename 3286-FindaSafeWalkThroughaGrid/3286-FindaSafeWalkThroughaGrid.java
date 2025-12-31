// Last updated: 12/31/2025, 10:20:05 PM
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int[][][] dp = new int[grid.size()][grid.get(0).size()][health+1];
4        boolean[][] vi = new boolean[grid.size()][grid.get(0).size()];
5        return helper(vi, grid, health, 0, 0, dp);
6        
7    }
8    public boolean helper(boolean[][] vi, List<List<Integer>> grid, int health, int row, int col, int[][][] dp ){
9        if(row==vi.length-1 && col==vi[0].length-1 && health-grid.get(row).get(col)>0){
10            return true;
11        }
12        if(row<0 || col<0 || row>=vi.length || col>=vi[0].length || vi[row][col] | health<=0 ){
13            return false;
14        }
15        if(dp[row][col][health]!=0){
16            return dp[row][col][health]==1;
17
18        }
19        boolean ans = false;
20        vi[row][col]=true;
21        ans = ans|helper(vi, grid, health-grid.get(row).get(col), row+1, col, dp);
22        ans = ans|helper(vi, grid, health-grid.get(row).get(col), row-1, col, dp);
23        ans = ans|helper(vi, grid, health-grid.get(row).get(col), row, col-1, dp);
24        ans = ans|helper(vi, grid, health-grid.get(row).get(col), row, col+1, dp);
25        vi[row][col]=false;
26        dp[row][col][health] = ans?1:-1;
27        return ans;
28
29    }
30}