// Last updated: 1/11/2026, 7:10:26 PM
1class Solution {
2    public int closestMeetingNode(int[] edges, int node1, int node2) {
3        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++){
5            
6            map.put(i, new HashSet<>());
7            //map.get(i).add(edges[i])
8        }
9        for(int i=0; i<edges.length; i++){
10            if(edges[i]==-1){
11                continue;
12            }
13            //map.put(i, new HashSet<>());
14            map.get(i).add(edges[i]);
15        }
16
17        int[] arr1 = helper(map, node1);
18        int[] arr2=helper(map, node2);
19        int ans = Integer.MAX_VALUE;
20        int r=-1;
21        for(int i=0; i<arr1.length; i++){
22            if(arr1[i]!=Integer.MAX_VALUE && arr2[i]!=Integer.MAX_VALUE){
23                if(ans>Math.max(arr1[i],arr2[i])){
24                    ans = Math.max(arr1[i],arr2[i]);
25                    r = i;
26                }
27            }
28        }
29        return r;
30
31
32        
33
34
35        
36    }
37    public int[] helper( HashMap<Integer, HashSet<Integer>> map, int st){
38        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]);
39        HashSet<Integer> vi = new HashSet<>();
40        int[] arr = new int[map.size()];
41        Arrays.fill(arr, Integer.MAX_VALUE);
42        pq.add(new int[]{st, 0});
43        arr[st]=0;
44        while(!pq.isEmpty()){
45            int[] ar = pq.poll();
46            if(vi.contains(ar[0])){
47                continue;
48            }
49            vi.add(ar[0]);
50            arr[ar[0]] = Math.min(arr[ar[0]], ar[1]);
51            for(int i: map.get(ar[0])){
52                if(!vi.contains(i) && arr[i]>arr[ar[0]]+1){
53                    pq.add(new int[]{i,arr[ar[0]]+1});
54                }
55            }
56        }
57        return arr;
58
59
60
61    }
62}