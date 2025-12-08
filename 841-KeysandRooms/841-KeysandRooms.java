// Last updated: 12/8/2025, 5:49:19 PM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        
4        HashSet<Integer> visited = new HashSet<>();
5        Queue<Integer> q = new LinkedList<>();
6        q.add(0);
7        while(!q.isEmpty()){
8            int r = q.poll();
9            if(visited.contains(r)){
10                continue;
11            }
12            visited.add(r);
13            for(int nbrs: rooms.get(r)){
14                if(!visited.contains(nbrs)){
15                    q.add(nbrs);
16
17                }
18            }
19        }
20        return visited.size()==rooms.size();
21    }
22}