// Last updated: 1/29/2026, 6:44:09 AM
1class Solution {
2    public int[] countOfPairs(int n, int x, int y) {
3        int[] ans = new int[n];
4        int[][] dp = new int[n+1][n+1];
5        for(int[] p: dp){
6            Arrays.fill(p, n);
7        }
8        dp[x][y]=1;
9        dp[y][x]=1;
10        for(int i=1; i<n; i++){
11            dp[i][i+1]=1;
12            dp[i+1][i]=1;
13        }
14        for(int k=1; k<=n; k++){
15            for(int i=1; i<=n; i++){
16                for(int j=i+1; j<=n; j++){
17                    if(i==j){
18                        dp[i][j]=0;
19                        continue;
20                    }
21                    dp[i][j]=Math.min(dp[i][j], dp[i][k]+dp[k][j]);
22                    dp[j][i]=dp[i][j];
23                    //System.out.println(dp[i][j]);
24                }
25            }
26        }
27        for(int i=1; i<=n; i++){
28            for(int j=1; j<=n; j++){
29                if(i!=j){
30                    ans[dp[i][j]-1]++;
31                }
32            }
33        }
34        return ans;
35        
36        
37    }
38}