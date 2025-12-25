// Last updated: 12/25/2025, 7:33:17 AM
1class Solution {
2    public long maximumHappinessSum(int[] happiness, int k) {
3        Arrays.sort(happiness);
4        int c=k-1;
5        long sum=0;
6        for(int i=happiness.length-k; i<happiness.length; i++){
7            long d = happiness[i]-c;
8            if(d>0){
9                sum=sum+d;
10            }
11            c--;
12        }
13        return sum;
14
15
16        
17    }
18}