// Last updated: 12/2/2025, 5:47:00 PM
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
11
12        if(map.size()<2){
13            return 0;
14        }
15        long p=1;
16        int c=0;
17        List<Long> li = new ArrayList<>();
18
19        for(int k: map.keySet()){
20            int a = map.get(k).size();
21            if(a>=2){
22                long d = ((long)a*((a-1)%mod)%mod)/2;
23                li.add(d);
24                c++;
25            }
26        }
27        p=0;
28        long sum=0;
29        for(int i=0; i<li.size(); i++){
30            sum=(sum+li.get(i)%mod)%mod;
31        }
32        for(int i=0; i<li.size()-1; i++){
33            sum=(sum-li.get(i))%mod;
34            long d = (li.get(i)*(sum%mod))%mod;
35            p=(p+d%mod)%mod;
36            
37        }
38
39        return (int)p;
40
41        
42    }
43}