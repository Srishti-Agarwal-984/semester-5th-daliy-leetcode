// Last updated: 1/31/2026, 2:52:27 PM
1class Solution {
2
3    public String kthSmallestPath(int[] destination, int k) {
4        int h = destination[1];
5        int v = destination[0];
6
7        StringBuilder sb = new StringBuilder();
8        int n=h+v;
9        for(int i=0; i<n; i++){
10            long countH = nCr(n-i-1, h - 1);
11
12            if (h>=1) {
13                if(k<=countH){
14                    sb.append('H');
15                    h--;
16                }
17                else {
18                    sb.append('V');
19                    k -= countH;
20                    v--;
21                }   
22            } 
23            else{
24                sb.append('V');
25                v--;
26            }
27        }
28
29        
30
31        return sb.toString();
32    }
33
34    // Compute nCr safely (no overflow for constraints)
35    private long nCr(int n, int r) {
36        if (r < 0 || r > n) return 0;
37        long res = 1;
38        r = Math.min(r, n - r);
39        for (int i = 1; i <= r; i++) {
40            res = res * (n - r + i) / i;
41        }
42        return res;
43
44    }
45}
46