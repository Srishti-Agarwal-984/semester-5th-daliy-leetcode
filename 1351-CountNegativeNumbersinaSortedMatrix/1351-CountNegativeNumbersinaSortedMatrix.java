// Last updated: 12/28/2025, 12:29:42 PM
1class Solution {
2    public int countNegatives(int[][] grid) {
3        int c=0;
4        for(int[] el: grid){
5            for(int e: el){
6                if(e<0){
7                    c++;
8                }
9            }
10        }
11        return c;
12        
13    }
14}