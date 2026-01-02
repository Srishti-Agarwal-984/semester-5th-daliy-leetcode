// Last updated: 1/2/2026, 7:13:46 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i, new HashMap<>());
6        }
7        for (int[] e : edges) {
8            int u = e[0], v = e[1], w = e[2];
9            map.get(u).put(v, Math.min(map.get(u).getOrDefault(v, Integer.MAX_VALUE), w));
10            map.get(v).put(u, Math.min(map.get(v).getOrDefault(u, Integer.MAX_VALUE), w));
11        }
12        int[] ans = new int[n];
13        Arrays.fill(ans, Integer.MAX_VALUE);
14        ans[0]=0;
15        HashSet<Integer> vi = new HashSet<>();
16        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b)->(a.val-b.val));
17        pq.add(new Pair(0, 0));
18        while(!pq.isEmpty()){
19            Pair ed = pq.poll();
20            if(vi.contains(ed.ei)){
21                continue;
22            }
23            vi.add(ed.ei);
24            ans[ed.ei]=ed.val;
25            for(int k: map.get(ed.ei).keySet()){
26                int new_val = map.get(ed.ei).get(k)+ans[ed.ei];
27                if(!vi.contains(k) && ans[k]>new_val && new_val<disappear[k]){
28                    pq.add(new Pair(k, new_val));
29                }
30            }
31        }
32        for(int i=0; i<n; i++){
33            if(ans[i]>=disappear[i]){
34                ans[i]=-1;
35            }
36        }
37        return ans;
38        
39        
40
41    }
42    class Pair{
43        int ei;
44        int val;
45        public Pair(int ei, int val){
46            this.ei = ei;
47            this.val = val;
48        }
49    }
50}