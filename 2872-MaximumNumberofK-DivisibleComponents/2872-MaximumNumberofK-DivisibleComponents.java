// Last updated: 11/28/2025, 1:36:09 PM
1class Solution {
2    HashSet<Integer> visited = new HashSet<>();
3    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
4        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
5        for(int i=0; i<n; i++){
6            map.put(i, new HashSet<>());
7        }
8        for(int[] a: edges){
9            map.get(a[0]).add(a[1]);
10            map.get(a[1]).add(a[0]);
11        }
12        int[] arr = new int[1];
13        visited.add(0);
14        helper(map, values, k, 0, -1, arr);
15        return arr[0];
16
17
18
19        
20    }
21    public int helper(HashMap<Integer, HashSet<Integer>> map,  int[] values, int k, int i, int p, int[] arr){
22        int sum=values[i];
23        for(int nbrs: map.get(i)){
24            if(!visited.contains(nbrs)){
25                visited.add(nbrs);
26                sum+=helper(map, values, k, nbrs, i, arr);
27                
28            }
29        }
30        if(sum%k==0){
31            arr[0]++;
32        }
33        return sum%k;
34    }
35    
36}