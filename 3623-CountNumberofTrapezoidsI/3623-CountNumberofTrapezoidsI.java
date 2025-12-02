// Last updated: 12/2/2025, 5:46:26 PM
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
27        if(li.size()==1){
28            return 0;
29        }
30        p=0;
31        long sum=0;
32        for(int i=0; i<li.size(); i++){
33            sum=(sum+li.get(i)%mod)%mod;
34        }
35
36        for(int i=0; i<li.size()-1; i++){
37            sum=(sum-li.get(i))%mod;
38            long d = (li.get(i)*(sum%mod))%mod;
39            p=(p+d%mod)%mod;
40            
41        }
42
43        return (int)p;
44
45        
46    }
47}