// Last updated: 1/3/2026, 2:23:36 PM
1class Solution {
2    HashMap<Integer,Integer> bobMap = new HashMap<>();
3    int alice;
4    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
5        HashMap<Integer,List<Integer>> map = new HashMap<>();
6        int n = amount.length;
7        for(int i = 0; i<n; i++){
8            map.put(i,new ArrayList<>());
9        }
10        for(int[] arr : edges){
11            int a = arr[0];
12            int b = arr[1];
13            map.get(a).add(b);
14            map.get(b).add(a);
15        }
16        int time = 0;
17        boolean[] visited = new boolean[n];
18        bobdfs(map,time,visited,bob);
19        alice = Integer.MIN_VALUE;
20        Arrays.fill(visited,false);
21        alicedfs(0,0,visited,map,0, amount);
22        return alice;
23    }
24    public boolean bobdfs(HashMap<Integer,List<Integer>> map, int time, boolean[] visited, int node){
25        visited[node] = true;
26        bobMap.put(node,time);
27        if(node == 0){
28            return true;
29        }
30        for(int nbrs : map.get(node)){
31            if(!visited[nbrs]){
32                if(bobdfs(map,time+1,visited,nbrs)){
33                    return true;
34                }
35            }
36        }
37
38        bobMap.remove(node);
39        return false;
40    }
41    public void alicedfs(int node, int time, boolean[] visited, HashMap<Integer,List<Integer>> map, int income, int[] amount){
42        visited[node] = true;
43        if(!bobMap.containsKey(node)){
44            income += amount[node];
45        }
46        else if(bobMap.containsKey(node) && bobMap.get(node) > time){
47            income += amount[node];
48        }
49        else if(bobMap.containsKey(node) && bobMap.get(node) == time){
50            income += (amount[node])/2;
51        }
52
53        if(map.get(node).size() == 1 && node != 0){
54            alice = Math.max(alice,income);
55        }
56
57        for(int nbrs : map.get(node)){
58            if(!visited[nbrs]){
59                alicedfs(nbrs,time+1,visited,map,income,amount);
60            }
61        }
62        visited[node] = false;
63    }
64}