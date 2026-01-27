// Last updated: 1/27/2026, 4:38:00 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int max=tickets[k];
4        int time=0;
5        for(int i=0; i<tickets.length; i++){
6            if(i<=k){
7                time=time+Math.min(max, tickets[i]);
8            }
9            else{
10                int min = max-1<0?0: max-1;
11                time = time+Math.min(min, tickets[i]);
12            }
13            
14        }
15        return time;
16        
17        
18    }
19}