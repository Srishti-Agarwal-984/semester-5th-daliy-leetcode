// Last updated: 1/27/2026, 6:39:35 AM
1class Solution {
2    public int getMaximumConsecutive(int[] coins) {
3        int i=0;
4        Arrays.sort(coins);
5        int c=0;
6        long reach=0;
7        while(true){
8            if(i<coins.length && coins[i]<=reach+1){
9                reach += coins[i];
10                i++;
11            }
12            else{
13                break;
14            }
15        }
16        return (int)reach+1;
17    }
18}