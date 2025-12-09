// Last updated: 12/9/2025, 11:46:49 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<isConnected.length; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int i=0; i<isConnected.length; i++){
8            for(int j =i+1; j<isConnected[0].length; j++){
9                if(isConnected[i][j] ==1){
10                    map.get(i).add(j);
11                    map.get(j).add(i);
12
13                }
14                
15            }
16        }
17        int c=0;
18        HashSet<Integer> visited  = new HashSet<>();
19        for(int i=0; i<isConnected[0].length; i++){
20            if(visited.contains(i)){
21                continue;
22            }
23            c++;
24            //System.out.println(i+" "+visited.size());
25            Queue<Integer> q = new LinkedList<>();
26            q.add(i);
27            while(!q.isEmpty()){
28                int r = q.poll();
29                 if(visited.contains(r)){
30                    continue;
31                }
32                visited.add(r);
33                for(int nbrs: map.get(r)){
34                    if(!visited.contains(nbrs)){
35                        q.add(nbrs);
36                    }
37                }
38
39            }
40        }
41        return c;
42        
43    }
44}