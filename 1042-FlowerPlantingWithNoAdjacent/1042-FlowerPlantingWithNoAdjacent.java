// Last updated: 12/26/2025, 10:27:06 PM
1class Solution {
2    public int[] gardenNoAdj(int n, int[][] paths) {
3        HashMap<Integer,List<Integer>> map = new HashMap<>();
4        for(int i = 1; i<=n; i++){
5            map.put(i,new ArrayList<>());
6        }
7
8        for(int[] arr : paths){
9            int a = arr[0];
10            int b = arr[1];
11            map.get(a).add(b);
12            map.get(b).add(a);
13        }
14
15        int[] res = new int[n];
16        for(int node : map.keySet()){
17            boolean[] vis = new boolean[5];
18            for(int nbrs : map.get(node)){
19                vis[res[nbrs-1]] = true;
20            }
21            for(int i = 1; i<=4; i++){
22                if(vis[i] == false){
23                    res[node-1] = i;
24                }
25            }
26        }
27        return res;
28        
29    }
30}