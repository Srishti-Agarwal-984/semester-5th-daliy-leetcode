// Last updated: 1/9/2026, 7:18:57 PM
1class Solution {
2    int[][] change = {{1, 0}, {1,1}, {0, 1}, {1, -1}, {-1, 0}, {-1,1}, {-1, -1},{0, -1}};
3    public int shortestPathBinaryMatrix(int[][] grid) {
4        int[][]dp = new int[grid.length][grid[0].length];
5        for(int[] p: dp){
6            Arrays.fill(p, -1);
7        }
8        int n=grid.length, m= grid[0].length;
9        if(grid[0][0]==1 || grid[n-1][m-1]!=0){
10            return -1;
11        }
12        int ans =100000;
13        Queue<int[]> q = new LinkedList<>();
14        q.add(new int[]{0, 0, 1});
15        while(!q.isEmpty()){
16            int[] arr = q.poll();
17            int row = arr[0], col = arr[1];
18            if(row==n-1 && col==m-1){
19                ans = Math.min(ans, arr[2]);
20                continue;
21            }
22            if(dp[arr[0]][arr[1]]!=-1){
23                continue;
24            }
25            dp[arr[0]][arr[1]] = arr[2];
26            for(int[] i: change){
27                int nr = row+i[0], nc = col+i[1];
28                if(nr<0 || nc<0 ||nr>=grid.length || nc>=grid[0].length || grid[nr][nc]==1 || dp[nr][nc]!=-1){
29                    continue;
30                }
31                q.add(new int[]{nr, nc, arr[2]+1});
32            }
33        }
34        return ans>=100000?-1:ans;
35    }
36}