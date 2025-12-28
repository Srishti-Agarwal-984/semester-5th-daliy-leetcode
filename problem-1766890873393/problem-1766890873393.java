// Last updated: 12/28/2025, 8:31:13 AM
1class Solution {
2    public long maximumScore(int[] nums) {
3        long[] q = new long[nums.length];
4        q[0]=nums[0];
5        for(int i=1; i<nums.length; i++){
6            q[i]=q[i-1]+nums[i];
7        }
8        long[] min = new long[nums.length];
9        min[nums.length-1] = nums[nums.length-1];
10        for(int i=nums.length-2; i>=0; i--){
11            min[i]=Math.min(min[i+1], nums[i]);
12        }
13        long max = Long.MIN_VALUE;
14        int r = -1;
15        for(int i=0; i<nums.length-1; i++){
16            long d=  q[i]-(min[i+1]);
17            if(d>max){
18                r=i;
19                max= d;
20                
21            }
22        }
23        return max;
24        
25    }
26}