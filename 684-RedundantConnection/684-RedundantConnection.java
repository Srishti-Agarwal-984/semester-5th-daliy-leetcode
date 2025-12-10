// Last updated: 12/10/2025, 10:22:57 PM
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5        for(int i=1; i<=edges.length; i++){
6            map.put(i, new HashSet<>());
7        }
8        for(int i=0; i<edges.length; i++){
9            map.get(edges[i][0]).add(edges[i][1]);
10            map.get(edges[i][1]).add(edges[i][0]);
11        }
12        for(int i=edges.length-1; i>0; i--){
13            int[] a  = new int[2];
14            map.get(edges[i][0]).remove(edges[i][1]);
15            map.get(edges[i][1]).remove(edges[i][0]);
16            HashSet<Integer> visited  = new HashSet<>();
17            Queue<Integer> q = new LinkedList<>();
18            q.add(1);
19            while(!q.isEmpty()){
20                int w = q.poll();
21                if(visited.contains(w)){
22                    continue;
23                }
24                visited.add(w);
25                for(int nbrs: map.get(w)){
26                    if(!visited.contains(nbrs)){
27                        //System.out.println(nbrs);
28                        q.add(nbrs);
29                    }
30                }
31            }
32            
33            if(visited.size()==edges.length){
34                a[0]=edges[i][0];
35                a[1]=edges[i][1];
36                return a;
37            }
38
39
40            map.get(edges[i][0]).add(edges[i][1]);
41            map.get(edges[i][1]).add(edges[i][0]);
42        }
43
44        
45        int[] ans = new int[2];
46        return ans;
47        
48        
49    }
50}