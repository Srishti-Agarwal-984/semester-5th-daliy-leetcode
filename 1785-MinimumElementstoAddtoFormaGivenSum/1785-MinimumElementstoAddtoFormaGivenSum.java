// Last updated: 1/16/2026, 6:58:45 AM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        long  sum=0;
4        long g=goal;
5        for(int i: nums){
6            sum=sum+i;
7        }
8        if(sum==g){
9            return 0;
10        }
11        else{
12            long u =  Math.abs(sum-goal);
13            long b = u/limit;
14            
15            if(u%limit!=0){
16                //System.out.println(*);
17                b++;
18            }
19            return (int)b;
20        }
21
22        
23    }
24}