// Last updated: 1/17/2026, 8:09:32 PM
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i, new HashMap<>());
6        }
7        k=k+1;
8        int[][] dp = new int[n][k+2];
9        for(int[] p: dp){
10            Arrays.fill(p, -1);
11        }
12        for(int[] u: flights){
13            map.get(u[0]).put(u[1], u[2]);
14        }
15        int ans = helper(map, src, dst, k, dp);
16        return ans>=1000000?-1: ans;
17    }
18    public int helper(HashMap<Integer, HashMap<Integer, Integer>> map, int src, int dst, int k,  int[][] dp ){
19        if(src==dst){
20            return 0;
21        }
22        if(k<=0){
23            return 1000000;
24        }
25        if(dp[src][k]!=-1){
26            return dp[src][k];
27        }
28        int ans=1000000;
29        for(int u: map.get(src).keySet()){
30            ans = Math.min(ans, map.get(src).get(u)+helper(map,u, dst, k-1, dp));
31        }
32        return dp[src][k]=ans;
33    }
34    
35}