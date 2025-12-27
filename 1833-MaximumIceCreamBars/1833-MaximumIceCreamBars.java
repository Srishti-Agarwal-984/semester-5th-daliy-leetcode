// Last updated: 12/27/2025, 11:35:49 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int c=0;
5        for(int el: costs){
6            if(el<=coins){
7                coins-=el;
8                c++;
9
10            }
11            else{
12                break;
13            }
14        }
15        return c;
16    }
17}