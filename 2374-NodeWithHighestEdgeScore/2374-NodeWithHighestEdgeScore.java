// Last updated: 1/2/2026, 6:47:53 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        long[] r = new long[edges.length];
4        long max =0;
5        for(int i=0; i<edges.length; i++){
6            long j = i;
7            r[edges[i]]+=j;
8            max = Math.max(max, r[edges[i]]);
9        }
10        int id = 0;
11        for(int i=0; i<edges.length; i++){
12            if(r[i]==max){
13                id =i;
14                break;
15            }
16        }
17        return id;
18
19        
20    }
21}