// Last updated: 1/27/2026, 2:55:45 PM
1class Solution {
2    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
3        for(int i = 0; i<n; i++){
4            if(group[i] == -1){
5                group[i] = m++;
6            }
7        }
8
9        HashMap<Integer,List<Integer>> map1 = new HashMap<>();
10        HashMap<Integer,List<Integer>> map2 = new HashMap<>();
11        for(int i = 0; i<n; i++){
12            map1.put(i,new ArrayList<>());
13        }
14        for(int i = 0; i<m; i++){
15            map2.put(i,new ArrayList<>());
16        }
17
18        for(int i = 0; i<n; i++){
19            for(int j : beforeItems.get(i)){
20                map1.get(j).add(i);
21
22                if(group[j] != group[i]){
23                    map2.get(group[j]).add(group[i]);
24                }
25            }
26        }
27
28        List<Integer> ll1 = toposort(map1);
29        List<Integer> ll2 = toposort(map2);
30
31        if(ll1.size() == 0 || ll2.size() == 0){
32            return new int[]{};
33        }
34
35        HashMap<Integer,List<Integer>> buck = new HashMap<>();
36
37        for(int el : ll1){
38            int idx = group[el];
39            buck.putIfAbsent(idx,new ArrayList<>());
40            buck.get(idx).add(el);
41        }
42
43        int[] ans = new int[n];
44        int i = 0;
45        for(int el : ll2){
46            if(buck.containsKey(el)){
47                // ans[i++] = buck.get(el);
48                for(int key : buck.get(el)){
49                    ans[i++] = key;
50                }
51            }
52        }
53        return ans;
54    }
55
56    public List<Integer> toposort(HashMap<Integer,List<Integer>> map){
57        int n = map.size();
58        int[] indeg = new int[n];
59        for(int i = 0; i<n;i++){
60            for(int el : map.get(i)){
61                indeg[el]++;
62            }
63        }
64
65        Queue<Integer> q = new LinkedList<>();
66        for(int i = 0; i<n; i++){
67            if(indeg[i] == 0){
68                q.add(i);
69            }
70        }
71
72        List<Integer> ans = new ArrayList<>();
73        while(!q.isEmpty()){
74            int el = q.poll();
75            ans.add(el);
76            for(int nbrs : map.get(el)){
77                indeg[nbrs]--;
78                if(indeg[nbrs] == 0){
79                    q.add(nbrs);
80                }
81            }
82        }
83        return ans.size() == map.size() ? ans : new ArrayList();
84    }
85}