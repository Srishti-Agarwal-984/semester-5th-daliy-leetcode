// Last updated: 1/3/2026, 1:56:22 PM
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
12        for(int i=0; i<n; i++){
13            if(in[i]==0){
14                HashSet<Integer> vi = new HashSet<>();
15                Queue<Integer> q = new LinkedList<>();
16                q.add(i);
17                while(!q.isEmpty()){
18                    int ep = q.poll();
19                    if(vi.contains(ep)){
20                        continue;
21                    }
22                    vi.add(ep);
23                    for(int nbrs : map.get(ep)){
24                        if(!vi.contains(nbrs)){
25                            q.add(nbrs);
26                        }
27                    }
28                }
29                if(vi.size()==n){
30                    return i;
31                }
32                else{
33                    break;
34                }
35            }
36        }
37        return -1;
38
39
40        
41    }
42}