// Last updated: 12/12/2025, 8:25:14 PM
1class Solution {
2    public int numMagicSquaresInside(int[][] grid) {
3        if(grid.length<3 || grid[0].length<3){
4            return 0;
5        }
6        int ans=0;
7        for(int i=0; i<grid.length-2; i++){
8            for(int j=0; j<grid[0].length-2; j++){
9                HashSet<Integer> st = new HashSet<>();
10                int a = 0;
11                for(int k=i; k<i+3; k++){
12                    for(int g=j; g<j+3; g++){
13                        if(grid[k][g]>=10 || grid[k][g]<=0){
14                            continue;
15                        }
16                        st.add(grid[k][g]);
17                    }
18                }
19                if(st.size()<9){
20                    continue;
21                }
22                int sum1 = grid[i][j]+grid[i][j+1]+grid[i][j+2];
23                int sum2 = grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
24                int sum3= grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
25                int sum4 = grid[i+1][j]+grid[i][j]+grid[i+2][j];
26                int sum6 = grid[i+1][j+1]+grid[i][j+1]+grid[i+2][j+1];
27                int sum5 = grid[i+1][j+2]+grid[i][j+2]+grid[i+2][j+2];
28                int d = grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
29                int d2 = grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
30                int as = sum1^sum2^sum3^sum4^sum5^sum6^d^d2;
31                if(sum1==sum2 && sum2==sum3 && sum3==sum4 && sum4==sum5 && sum5==sum6 && d==sum6 && d==d2){
32                    ans++;
33                } 
34            }
35        }
36        return ans;
37        
38    }
39}