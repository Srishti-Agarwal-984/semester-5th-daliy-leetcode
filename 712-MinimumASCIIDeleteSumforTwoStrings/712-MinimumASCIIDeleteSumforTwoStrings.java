// Last updated: 12/7/2025, 6:14:05 AM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
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
15            int r=0;
16            for(int k=j; k<s2.length(); k++){
17                r+=s2.charAt(k);
18            }
19            return r;
20        }
21         if(j==s2.length()){
22            int r=0;
23            for(int k=i; k<s1.length(); k++){
24                r+=s1.charAt(k);
25            }
26            return r;
27        }
28        if(dp[i][j]!=-1){
29            return dp[i][j];
30        }
31        if(s1.charAt(i)==s2.charAt(j)){
32            int ans=helper(s1, s2, i+1, j+1, dp);
33            return dp[i][j]=ans;
34        }
35        int l = helper(s1, s2, i+1, j, dp)+s1.charAt(i);
36        int r = helper(s1, s2, i, j+1, dp)+s2.charAt(j);
37        int ans=Math.min(l,r);
38        return  dp[i][j]=ans;
39
40
41    }
42}