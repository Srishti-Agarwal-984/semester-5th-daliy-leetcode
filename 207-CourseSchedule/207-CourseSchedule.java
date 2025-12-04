// Last updated: 12/4/2025, 7:03:17 AM
1class Solution {
2    public boolean canFinish(int n, int[][] prerequisites) {
3        // topological sort
4        HashMap<Integer, List<Integer>> map = new HashMap<>();
5        for(int i=0; i<n; i++){
6            map.put(i, new ArrayList<>());
7        }
8        for(int i[] :  prerequisites){
9            map.get(i[1]).add(i[0]);
10        }
11        int[] idn = new int[n];
12        for(int i=0; i<n; i++){
13            for(int nbrs: map.get(i)){
14                idn[nbrs]++;
15            }
16        }
17        Queue<Integer> q = new LinkedList<>();
18        for(int i=0; i<n; i++){
19            if(idn[i]==0){
20                q.add(i);
21            }
22        }
23        int c=0;
24        while(!q.isEmpty()){
25            int r = q.poll();
26            for(int nbrs: map.get(r)){
27                idn[nbrs]--;
28                if(idn[nbrs]==0){
29                    q.add(nbrs);
30                }
31            }
32            c++;
33
34
35        }
36        return c==n;
37
38        
39    }
40}