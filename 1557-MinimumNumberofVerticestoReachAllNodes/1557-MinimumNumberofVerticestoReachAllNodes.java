// Last updated: 1/24/2026, 8:04:07 PM
1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3        int[] in  = new int[n];
4        for(List<Integer> e: edges){
5            in[e.get(1)]++;
6        }
7        List<Integer> li = new ArrayList<>();
8        for(int i = 0; i<n; i++){
9            if(in[i]==0){
10                li.add(i);
11            }
12        }
13        return li;
14        
15    }
16}