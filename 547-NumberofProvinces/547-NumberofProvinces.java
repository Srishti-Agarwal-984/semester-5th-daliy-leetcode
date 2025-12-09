// Last updated: 12/9/2025, 11:46:29 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<isConnected.length; i++){
5            map.put(i, new HashSet<>());
6        }
7        for(int i=0; i<isConnected.length; i++){
8            for(int j =i+1; j<isConnected[0].length; j++){
9                if(i==j){
10                    continue;
11                }
12                if(isConnected[i][j] ==1){
13                    map.get(i).add(j);
14                    map.get(j).add(i);
15
16                }
17                
18            }
19        }
20        int c=0;
21        HashSet<Integer> visited  = new HashSet<>();
22        for(int i=0; i<isConnected[0].length; i++){
23            if(visited.contains(i)){
24                continue;
25            }
26            c++;
27            //System.out.println(i+" "+visited.size());
28            Queue<Integer> q = new LinkedList<>();
29            q.add(i);
30            while(!q.isEmpty()){
31                int r = q.poll();
32                 if(visited.contains(r)){
33                    continue;
34                }
35                visited.add(r);
36                for(int nbrs: map.get(r)){
37                    if(!visited.contains(nbrs)){
38                        q.add(nbrs);
39                    }
40                }
41
42            }
43        }
44        return c;
45        
46    }
47}