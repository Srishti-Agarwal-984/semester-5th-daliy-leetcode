// Last updated: 1/28/2026, 1:04:12 PM
1class Solution {
2    public int[] countRectangles(int[][] rectangles, int[][] points) {
3        List<Integer>[] li = new ArrayList[101];
4        for (int i = 1; i <= 100; i++) {
5            li[i] = new ArrayList<>();
6        }
7        for (int[] r : rectangles) {
8            li[r[1]].add(r[0]);
9        }
10        for (int i = 1; i <= 100; i++) {
11            Collections.sort(li[i]);
12        }
13        int[] ans = new int[points.length];
14        for(int i=0; i<ans.length; i++){
15            int x = points[i][0];
16            int y = points[i][1];
17            int cal=0;
18            for(int j=y; j<=100; j++){
19                int si = 0, en =li[j].size()-1, e=-1;
20                while(si<=en){
21                    int mid = si+(en-si)/2;
22                    if(li[j].get(mid)>=x){
23                        e=mid;
24                        en=mid-1;
25                    }
26                    else{
27                        si = mid+1;
28                    }
29                }
30                cal+=e==-1?0:li[j].size()-e;
31            }
32            ans[i]=cal;
33        }
34        return ans;
35    }
36}