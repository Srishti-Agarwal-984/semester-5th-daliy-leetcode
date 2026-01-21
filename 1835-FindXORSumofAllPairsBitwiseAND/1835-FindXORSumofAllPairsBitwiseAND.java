// Last updated: 1/21/2026, 12:07:37 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int r = 0, q=0;
4        for(int i: arr1){
5            r = r^i;
6        }
7        for(int i: arr2){
8           q=q^i;
9        }
10        return r&q;
11        
12    }
13}