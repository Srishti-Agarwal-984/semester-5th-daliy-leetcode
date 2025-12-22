// Last updated: 12/22/2025, 4:00:26 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int ans=Integer.MAX_VALUE;
4        for(int i=0; i<strs[0].length(); i++){
5           int[][] dp = new int[strs[0].length()][strs[0].length()];
6            for(int[] a:dp){
7                Arrays.fill(a, -1);
8            }
9            ans=Math.min(ans, helper(strs, i, i,dp)+i);
10        }
11        
12        return ans;
13    }
14    public int helper(String[] strs, int p, int i,int[][] dp ){
15        if(i>=strs[0].length()){
16            return 0;
17        }
18        if(dp[p][i]!=-1){
19            return dp[p][i];
20        }
21        int c=0;
22        for(String s: strs){
23            if(s.charAt(p)>s.charAt(i)){
24                c++;
25                break;
26            }
27        }
28        int inc=1000000, exc=1000000;
29        if(c==0){
30            inc=helper(strs, i, i+1,dp);
31        }
32        exc=1+helper(strs, p, i+1,dp);
33        return dp[p][i]=Math.min(inc, exc);
34
35    }
36}