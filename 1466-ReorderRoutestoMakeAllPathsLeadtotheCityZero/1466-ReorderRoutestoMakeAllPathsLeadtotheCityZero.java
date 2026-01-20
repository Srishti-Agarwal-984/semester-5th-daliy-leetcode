// Last updated: 1/20/2026, 6:36:54 AM
1class Solution {
2    public int minReorder(int n, int[][] connections) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        HashMap<Integer, HashSet<Integer>> map1 = new HashMap<>();
5        for(int i=0; i<n; i++){
6            map.put(i, new HashSet<>());
7            map1.put(i, new HashSet<>());
8        }
9        for(int[] c: connections){
10            map.get(c[0]).add(c[1]);
11            map.get(c[1]).add(c[0]);
12            map1.get(c[1]).add(c[0]);
13        }
14        Queue<Integer> q= new LinkedList<>();
15        q.add(0);
16        int count=0;
17        HashSet<Integer> vi = new HashSet<>();
18        while(!q.isEmpty()){
19            int p = q.poll();
20            if(vi.contains(p)){
21                continue;
22            }
23            vi.add(p);
24            for(int t: map.get(p)){
25                if(!vi.contains(t)){
26                    if(map1.get(t).contains(p)){
27                        count++;
28                    }
29                    q.add(t);
30                }
31            }
32
33        }
34        return count;
35    }
36}