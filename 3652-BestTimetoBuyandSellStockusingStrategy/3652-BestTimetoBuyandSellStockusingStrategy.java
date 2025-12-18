// Last updated: 12/18/2025, 9:23:58 PM
1class Solution {
2    public long maxProfit(int[] prices, int[] strategy, int k) {
3        long[] sum= new long[prices.length];
4        sum[0]=prices[0]*strategy[0];
5        long[] l = new long[prices.length];
6        l[0]=prices[0];
7        for(int i=1; i<strategy.length; i++){
8            sum[i]=sum[i-1]+prices[i]*strategy[i];
9            l[i]+=l[i-1]+prices[i];
10        }
11        long ans=sum[prices.length-1];
12        for(int i=0; i<=prices.length-k; i++){
13            long f = sum[prices.length-1]-sum[i+k-1]+(l[i+k-1]-l[i+(k/2)-1]);
14            if(i!=0){
15                f=f+sum[i-1];
16            }
17            ans=Math.max(ans, f);
18        }
19        return ans;
20    }
21}