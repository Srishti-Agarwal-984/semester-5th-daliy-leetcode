// Last updated: 1/8/2026, 7:40:28 PM
1class Solution {
2    public int strangePrinter(String s) {
3        int[][][] dp = new int[s.length()][s.length()][s.length()+1];
4        for(int[][] arr : dp){
5            for(int[] a : arr){
6                Arrays.fill(a,-1);
7            }
8        }
9        return helper(dp, s, 0, s.length()-1, 0);
10    }
11    public int helper(int[][][] dp,String s, int st, int en,int streak ){
12        if(st>en){
13            return 0;
14        }
15        while(st<en && s.charAt(st)==s.charAt(st+1)){
16            st++;
17            streak++;
18        }
19        if(dp[st][en][streak]!=-1){
20            return dp[st][en][streak];
21        }
22        int ans = 1+helper(dp, s, st+1, en, 0);
23        for(int i=st+1; i<=en; i++){
24            if(s.charAt(st)==s.charAt(i)){
25                int e = helper(dp, s, st+1, i-1, 0)+helper(dp, s, i, en, st+1);
26                ans = Math.min(ans, e);
27            }
28        }
29        return dp[st][en][streak] = ans;
30
31    }
32    
33
34}