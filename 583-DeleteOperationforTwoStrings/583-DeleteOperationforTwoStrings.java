// Last updated: 12/7/2025, 6:16:40 AM
1class Solution {
2    public int minDistance(String s1, String s2) {
3        int[][] dp = new int[s1.length()][s2.length()];
4        for(int[] i:dp){
5            Arrays.fill(i, -1);
6        }
7        return helper(s1, s2, 0, 0, dp);
8        
9    }
10    public int helper(String s1, String s2, int i, int j, int[][] dp){
11        if(i==s1.length() && j==s2.length()){
12            return 0;
13        }
14        if(i==s1.length()){
15            int r=s2.length()-j;
16            
17            return r;
18        }
19         if(j==s2.length()){
20            int r=s1.length()-i;
21            return r;
22        }
23        if(dp[i][j]!=-1){
24            return dp[i][j];
25        }
26        if(s1.charAt(i)==s2.charAt(j)){
27            int ans=helper(s1, s2, i+1, j+1, dp);
28            return dp[i][j]=ans;
29        }
30        int l = helper(s1, s2, i+1, j, dp)+1;
31        int r = helper(s1, s2, i, j+1, dp)+1;
32        int ans=Math.min(l,r);
33        return  dp[i][j]=ans;
34
35
36    }
37}