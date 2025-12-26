// Last updated: 12/26/2025, 7:06:10 PM
1class Solution {
2    public int findRotateSteps(String ring, String key) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<26; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int i=0; i<ring.length(); i++){
8            map.get(ring.charAt(i)-'a').add(i);
9        }
10        int[][] dp = new int[ring.length()][key.length()];
11        for(int[] kl: dp){
12            Arrays.fill(kl, -1);
13
14        }
15        return helper(map, key, 0, ring, 0, dp)+key.length();
16        
17    }
18    public int helper(HashMap<Integer, HashSet<Integer>> map ,String key, int mid, String ring, int i, int[][] dp){
19        if(i>=key.length()){
20            return 0;
21        }
22        if(dp[mid][i]!=-1){
23            return dp[mid][i];
24        }
25        int ans=0;
26        int ed = key.charAt(i)-'a';
27        int step=Integer.MAX_VALUE;
28        for(int op: map.get(ed)){
29            int u = Math.abs(op-mid);
30            int qw=op+ring.length()-mid;
31            qw = Math.min(qw, mid-0+ring.length()-op);
32            qw = Math.min(qw, u);
33            step = Math.min(step, qw+helper(map, key, op, ring, i+1, dp));
34        }
35        ans=ans+step;
36        return dp[mid][i]=ans;
37    }
38}