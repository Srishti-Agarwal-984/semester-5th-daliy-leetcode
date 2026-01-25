// Last updated: 1/25/2026, 7:50:07 AM
1class Solution {
2    public int maximalNetworkRank(int n, int[][] roads) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int[] r: roads){
8            map.get(r[0]).add(r[1]);
9            map.get(r[1]).add(r[0]);
10        }
11        int ans=0;
12        for(int i=0; i<n; i++){
13            for(int j=i+1; j<n; j++){
14                int lq = map.get(i).size();
15                int wq = map.get(j).size();
16                if(map.get(i).contains(j)){
17                    lq--;
18                }
19                ans =Math.max(ans, lq+wq);
20            }
21        }
22        return ans;
23    }
24}