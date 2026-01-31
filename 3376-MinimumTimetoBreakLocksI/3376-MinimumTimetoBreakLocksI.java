// Last updated: 1/31/2026, 3:16:40 PM
1class Solution {
2    public int findMinimumTime(List<Integer> strength, int k) {
3        //Collections.sort(strength);
4        int x=1;
5        int e=0;
6        boolean[] vi = new boolean[strength.size()];
7        return helper(vi, strength, k, 1);
8    }
9    public int cal(int t, int x){
10        int move = t/x;
11        if(t%x!=0){
12            move++;
13        }
14        return move;
15
16    }
17    public int helper(boolean[] vi, List<Integer> strength, int k, int x){
18        int ans= 100000000;
19        for(int i=0; i<strength.size(); i++){
20            if(!vi[i]){
21                vi[i]=true;
22                int ca = cal(strength.get(i), x);
23                int total = ca+helper(vi, strength, k, x+k);
24                ans = Math.min(ans, total);
25                vi[i]=false;
26            }
27        }
28        
29        return ans==100000000?0:ans;
30
31    }
32}