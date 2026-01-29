// Last updated: 1/29/2026, 4:47:20 PM
1class Solution {
2    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
3        long[][] dis = new long[26][26];
4        long INF = (long)1e15;
5        for(int i = 0; i<26; i++){
6            Arrays.fill(dis[i],INF);
7            dis[i][i] = 0;
8        }
9
10        for(int i = 0; i<original.length; i++){
11            int u = original[i]-'a';
12            int v = changed[i]-'a';
13            int c = cost[i];
14            dis[u][v] = Math.min(dis[u][v],c);
15        }
16        for(int k = 0; k<26; k++){
17            for(int i = 0; i<26; i++){
18                for(int j = 0; j<26; j++){
19                    dis[i][j] = Math.min(dis[i][j],dis[i][k] + dis[k][j]);
20                }
21            }
22        }
23
24        long ans = 0;
25        for(int i = 0; i<source.length(); i++){
26            int ch1 = source.charAt(i) -'a';
27            int ch2 = target.charAt(i) -'a';
28            if(dis[ch1][ch2] == INF){
29                return -1;
30            }
31            ans += dis[ch1][ch2];
32        }
33        return ans;
34    }
35}