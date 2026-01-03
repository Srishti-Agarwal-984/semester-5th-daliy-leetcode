// Last updated: 1/3/2026, 3:01:36 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=1; i<=n; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int i=0; i<dislikes.length; i++){
8            map.get(dislikes[i][0]).add(dislikes[i][1]);
9            map.get(dislikes[i][1]).add(dislikes[i][0]);
10        }
11        Queue<Pair> pq = new LinkedList<>();
12        HashMap<Integer, Integer> map1 = new HashMap<>();
13        for(int i=1; i<=n; i++){
14            if(map1.containsKey(i)){
15                continue;
16            }
17            pq.add(new Pair(i, 0));
18            while(!pq.isEmpty()){
19                Pair p = pq.poll();
20                if(map1.containsKey(p.vtx)){
21                    int a = p.dist;
22                    if(a!=map1.get(p.vtx)){
23                        return false;
24                    }
25                    continue;
26                }
27                map1.put(p.vtx, p.dist);
28                for(int nbrs: map.get(p.vtx)){
29                    if(!map1.containsKey(nbrs)){
30                        pq.add(new Pair(nbrs, p.dist+1));
31                    }
32                }
33            }
34        }
35        return true;
36
37        
38    }
39    class Pair{
40        int vtx;
41        int dist;
42        public Pair(int vtx, int dist){
43            this.vtx=vtx;
44            this.dist=dist;
45        }
46    }
47}