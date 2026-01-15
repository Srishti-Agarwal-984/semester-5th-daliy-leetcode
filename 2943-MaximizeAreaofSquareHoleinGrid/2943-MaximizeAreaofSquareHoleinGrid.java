// Last updated: 1/15/2026, 4:05:43 PM
1class Solution {
2    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
3        Arrays.sort(vBars);
4        Arrays.sort(hBars);
5        int c=1;
6        int maxw = 1;
7        int maxh=1;
8        for(int i=1; i<hBars.length; i++){
9            if(hBars[i]==hBars[i-1]+1){
10                c++;
11            }
12            else{
13                maxw = Math.max(maxw, c);
14                c=1;
15            }
16        }
17        maxw = Math.max(maxw, c);
18        c=1;
19        for(int i=1; i<vBars.length; i++){
20            if(vBars[i]==vBars[i-1]+1){
21                c++;
22            }
23            else{
24                maxh = Math.max(maxh, c);
25                c=1;
26            }
27        }
28        maxh = Math.max(maxh, c);
29        int r = Math.min(maxh, maxw);
30        return (r+1)*(r+1);
31
32
33        
34    }
35}