// Last updated: 1/3/2026, 1:55:55 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i, new HashSet<>());
6        }
7        int[] in = new int[n];
8        for(int[] e: edges){
9            map.get(e[0]).add(e[1]);
10            in[e[1]]++;
11        }
12        int c=0;
13        int r=-1;
14        for(int i: in){
15            if(i==0){
16                c++;
17            }
18
19        }
20        if(c!=1){
21            return -1;
22        }
23        for(int i=0; i<n; i++){
24            if(in[i]==0){
25                HashSet<Integer> vi = new HashSet<>();
26                Queue<Integer> q = new LinkedList<>();
27                q.add(i);
28                while(!q.isEmpty()){
29                    int ep = q.poll();
30                    if(vi.contains(ep)){
31                        continue;
32                    }
33                    vi.add(ep);
34                    for(int nbrs : map.get(ep)){
35                        if(!vi.contains(nbrs)){
36                            q.add(nbrs);
37                        }
38                    }
39                }
40                if(vi.size()==n){
41                    return i;
42                }
43                else{
44                    break;
45                }
46            }
47        }
48        return -1;
49
50
51        
52    }
53}