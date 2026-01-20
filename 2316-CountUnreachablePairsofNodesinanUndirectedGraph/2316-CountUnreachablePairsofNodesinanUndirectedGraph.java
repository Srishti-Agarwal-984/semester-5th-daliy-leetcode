// Last updated: 1/20/2026, 11:19:57 PM
1class Solution {
2    public long countPairs(int n, int[][] edges) {
3        //List<Integer> li = new ArrayList<>();
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5        for(int i=0; i<n; i++){
6            map.put(i, new HashSet<>());
7        }
8        for(int[] e: edges){
9            map.get(e[0]).add(e[1]);
10            map.get(e[1]).add(e[0]);
11        }
12        HashSet<Integer> vi = new HashSet<>();
13        List<Long> li = new ArrayList<>();
14        for(int i=0; i<n; i++){
15            if(vi.contains(i)){
16                continue;
17            }
18            Queue<Integer> q= new LinkedList<>();
19            q.add(i);
20            while(!q.isEmpty()){
21                int r = q.poll();
22                if(vi.contains(r)){
23                    continue;
24                }
25                vi.add(r);
26                for(int nbrs: map.get(r)){
27                    if(vi.contains(nbrs)){
28                        continue;
29                    }
30                    q.add(nbrs);
31                }
32            }
33            li.add((long)vi.size());
34        }
35        long sum=0;
36
37        sum=sum+li.get(0)*(n-li.get(0));
38        for(int i=1; i<li.size(); i++){
39            long d = li.get(i)-li.get(i-1);
40            long f= n-li.get(i);
41            sum=sum+f*d;
42        }
43        return sum;
44    }
45}