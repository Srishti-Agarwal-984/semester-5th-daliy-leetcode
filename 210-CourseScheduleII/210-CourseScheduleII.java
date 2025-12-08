// Last updated: 12/8/2025, 6:23:22 AM
1class Solution {
2    public int[] findOrder(int n, int[][] p) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<n; i++){
5            map.put(i, new ArrayList<>());
6        }
7        int[] ind = new int[n];
8        for(int[] a: p){
9            map.get(a[1]).add(a[0]);
10            ind[a[0]]++;
11        }
12        int[] ans = new int[n];
13        int e=0;
14        Queue<Integer> q = new LinkedList<>();
15        for(int i=0; i<n; i++){
16            if(ind[i]==0){
17                ans[e]=i;
18                e++;
19                q.add(i);
20            }
21        }
22        HashSet<Integer> st = new HashSet<>();
23        while(!q.isEmpty()){
24            int r = q.poll();
25            if(st.contains(r)){
26                continue;
27            }
28            st.add(r);
29            for(int nbrs: map.get(r)){
30                ind[nbrs]--;
31                if(ind[nbrs]==0){
32                    ans[e]=nbrs;
33                    e++;
34
35                    q.add(nbrs);
36                }
37            }
38        }
39        return st.size()==n? ans: new int[0];
40
41
42    }
43}