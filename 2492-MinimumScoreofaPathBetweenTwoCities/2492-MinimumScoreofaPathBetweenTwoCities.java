// Last updated: 1/19/2026, 5:08:30 PM
1class Solution {
2    public int minScore(int n, int[][] roads) {
3        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
4        for(int i=1; i<=n; i++){
5            map.put(i, new HashMap<>());
6        }
7        for(int[] r: roads){
8            map.get(r[0]).put(r[1], r[2]);
9            map.get(r[1]).put(r[0], r[2]);
10        }
11        int[] arr = new int[n+1];
12        Arrays.fill(arr, Integer.MAX_VALUE);
13        arr[1]=0;
14        HashSet<Integer> vi = new HashSet<>();
15
16        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]);
17        pq.add(new int[]{1, 0});
18        int ans=Integer.MAX_VALUE;
19        while(!pq.isEmpty()){
20            int[] p = pq.poll();
21            
22            vi.add(p[0]);
23            arr[p[0]]=ans;
24            for(int q: map.get(p[0]).keySet()){
25                ans= Math.min(ans,map.get(p[0]).get(q));
26                if(!vi.contains(q) && arr[q]>ans){
27                    arr[q]=ans;
28                    pq.add(new int[]{q , ans});
29                }
30            }
31        }
32        return ans;
33        
34    }
35}