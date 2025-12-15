// Last updated: 12/16/2025, 4:54:08 AM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        long ans=0;
4        long r=1;
5        for(int i=1; i<prices.length; i++){
6            if(prices[i]-prices[i-1]==-1){
7                r++;
8            }
9            else{
10                ans=ans+(r*(r+1))/2;
11                r=1;
12            }
13        }
14        ans=ans+(r*(r+1))/2;
15        return ans;
16        
17    }
18}