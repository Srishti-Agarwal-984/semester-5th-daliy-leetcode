// Last updated: 12/21/2025, 3:51:54 PM
1class Solution {
2    public int[] loudAndRich(int[][] richer, int[] quiet) {
3        HashMap<Integer, List<Integer>> map = new HashMap<>();
4        for(int i=0; i<quiet.length; i++){
5            map.put(i, new ArrayList<>());
6        }
7        for(int i=0; i<richer.length; i++){
8            map.get(richer[i][1]).add(richer[i][0]);
9        }
10        int[] ans = new int[quiet.length];
11        for(int i=0; i<ans.length; i++){
12            int r = -1, l=Integer.MAX_VALUE;
13            Queue<Integer> q = new LinkedList<>();
14            q.add(i);
15            HashSet<Integer> vi = new HashSet<>();
16            if(map.get(i).size()==0){
17                ans[i]=i;
18                continue;
19            }
20            while(!q.isEmpty()){
21                int p = q.poll();
22                if(vi.contains(p)){
23                    continue;
24                }
25                vi.add(p);
26                if(quiet[p]<l){
27                    l=quiet[p];
28                    r = p;
29                }
30                for(int t: map.get(p) ){
31                    if(!vi.contains(t)){
32                        q.add(t);
33                    }
34                }
35            }
36            ans[i]=r;
37        }
38        return ans;
39
40        
41
42        
43    }
44    
45}