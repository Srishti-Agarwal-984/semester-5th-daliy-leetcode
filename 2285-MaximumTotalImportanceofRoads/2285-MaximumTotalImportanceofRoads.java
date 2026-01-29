// Last updated: 1/29/2026, 4:10:05 PM
1class Solution {
2    public long maximumImportance(int n, int[][] roads) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i,new HashSet<>());
6        }
7        
8        for(int[] r: roads){
9            map.get(r[0]).add(r[1]);
10            map.get(r[1]).add(r[0]);
11        }
12
13        PriorityQueue<Integer> pq= new PriorityQueue<>((a, b)->b-a);
14        for(int i=0; i<n; i++){
15            pq.add(map.get(i).size());
16        }
17        long ans=0;
18        while(!pq.isEmpty()){
19            long d = pq.poll();
20            long f=n;
21            ans= ans+d*f;
22            n--;
23        }
24        return ans;
25        
26    }
27}