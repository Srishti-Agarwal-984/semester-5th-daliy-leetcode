// Last updated: 1/1/2026, 10:54:52 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        HashSet<Integer> st = new HashSet<>();
4        for(int[]e : edges){
5            if(st.contains(e[0])){
6                return e[0];
7            }
8            st.add(e[0]);
9            if(st.contains(e[1])){
10                return e[1];
11            }
12            st.add(e[1]);
13        }
14        return 1;
15        
16        
17    }
18}