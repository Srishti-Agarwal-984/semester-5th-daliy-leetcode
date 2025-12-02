// Last updated: 12/2/2025, 5:48:11 PM
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
18        long sum=0;
19
20        for(int k: map.keySet()){
21            int a = map.get(k).size();
22            if(a>=2){
23                long d = ((long)a*((a-1)%mod)%mod)/2;
24                sum=(sum+d)%mod;
25                li.add(d);
26                c++;
27            }
28        }
29        p=0;
30        for(int i=0; i<li.size()-1; i++){
31            sum=(sum-li.get(i))%mod;
32            long d = (li.get(i)*(sum%mod))%mod;
33            p=(p+d%mod)%mod;
34            
35        }
36
37        return (int)p;
38
39        
40    }
41}