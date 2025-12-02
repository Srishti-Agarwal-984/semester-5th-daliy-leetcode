// Last updated: 12/2/2025, 5:48:57 PM
1class Solution {
2    int mod = 1000000007;
3    public int countTrapezoids(int[][] points) {
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5        for(int i=0; i<points.length; i++){
6            if(!map.containsKey(points[i][1])){
7                 map.put(points[i][1], new HashSet<>());
8            }
9            map.get(points[i][1]).add(points[i][0]);
10        }
11        long p=1;
12        int c=0;
13        List<Long> li = new ArrayList<>();
14        long sum=0;
15
16        for(int k: map.keySet()){
17            int a = map.get(k).size();
18            if(a>=2){
19                long d = ((long)a*((a-1)%mod)%mod)/2;
20                sum=(sum+d)%mod;
21                li.add(d);
22                c++;
23            }
24        }
25        p=0;
26        for(int i=0; i<li.size()-1; i++){
27            sum=(sum-li.get(i))%mod;
28            long d = (li.get(i)*(sum%mod))%mod;
29            p=(p+d%mod)%mod;
30            
31        }
32        return (int)p;
33
34        
35    }
36}