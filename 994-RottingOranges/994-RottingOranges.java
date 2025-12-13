// Last updated: 12/13/2025, 8:02:18 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        HashSet<Pair> li = new HashSet<>();
4        int nfo=0, nro=0;
5        for(int i=0; i<grid.length; i++){
6            for(int j=0; j<grid[0].length; j++){
7                if(grid[i][j]==1){
8                    nfo++;
9                }
10                else if(grid[i][j]==2){
11                   li.add(new Pair(i, j));
12                }
13            }
14
15        }
16        if(nfo==0){
17            return 0;
18        }
19        if(li.size()==0){
20            return -1;
21        }
22        
23        int c=0;
24        while(nfo>0){
25            HashSet<Pair> l1 = new HashSet<>();
26            c++;
27            for(Pair p: li){
28                int r=p.r;
29                int col=p.col;
30                if(r>0 && !li.contains(new Pair(r-1, col)) && grid[r-1][col]==1){
31                    l1.add(new Pair(r-1, col));
32                }
33                if(r<grid.length-1 && !li.contains(new Pair(r+1, col)) && grid[r+1][col]==1){
34                    l1.add(new Pair(r+1, col));
35                }
36                if(col>0 && !li.contains(new Pair(r, col-1)) && grid[r][col-1]==1){
37                    l1.add(new Pair(r, col-1));
38                }
39                if(col<grid[0].length-1 && !li.contains(new Pair(r, col+1)) && grid[r][col+1]==1){
40                    l1.add(new Pair(r, col+1));
41                }
42
43            }
44            if(l1.size()==0){
45                break;
46            }
47            for(Pair p: l1){
48                li.add(p);
49            }
50            nfo-=l1.size();
51
52
53        }
54        return nfo==0?c:-1;
55        
56    }
57    class Pair{
58        int r;
59        int col;
60        public Pair(int r, int col){
61            this.r=r;
62            this.col=col;
63        }
64        @Override
65        public boolean equals(Object o) {
66            if (this == o) return true;
67            if (o == null || getClass() != o.getClass()) return false;
68            Pair pair = (Pair) o;
69            return r == pair.r && col == pair.col;
70        }
71
72        @Override
73        public int hashCode() {
74            return Objects.hash(r, col);
75        }
76    }
77}