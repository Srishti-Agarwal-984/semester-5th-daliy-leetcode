// Last updated: 12/5/2025, 3:39:23 PM
1class Solution {
2    public int maxScore(int n, int k, int[][] stayScore, int[][] travelScore) {
3        int[][] dp = new int[k][n];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        int ans = 0;
8        for(int i = 0; i<n; i++){
9            ans = Math.max(ans,helper(k-1,i,stayScore, travelScore,dp));
10        }
11        return ans;
12    }
13    public int helper(int day, int city, int[][] stay, int[][] travel, int[][] dp){
14        if(day == 0){
15            int ans = stay[0][city];
16            for(int i = 0; i<travel.length; i++){
17                ans = Math.max(ans,travel[i][city]);
18            }
19            return ans;
20        }
21        if(dp[day][city] != -1){
22            return dp[day][city];
23        }
24        int take = helper(day-1,city,stay,travel,dp)+stay[day][city];
25        int notake = 0;
26        for(int i = 0; i<travel.length; i++){
27            notake= Math.max(notake,helper(day-1,i,stay,travel,dp)+travel[i][city]);
28        }
29        return dp[day][city] = Math.max(take,notake);
30    }
31}