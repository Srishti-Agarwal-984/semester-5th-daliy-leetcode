// Last updated: 1/25/2026, 5:14:42 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k1) {
3        Arrays.sort(nums);
4        long p = 1;
5        int si=0;
6        long sum=0;
7        long k = k1;
8        while(si<nums.length && k>0){
9            if(p<nums[si]){
10                long u = nums[si]-p;
11                u = Math.min(u, k);
12                k = k-u;
13                long h = (p*(p-1))/2;
14                long g = ((p+u)*(p+u-1))/2;
15                p = p+u;
16                sum=sum+g-h;
17            }
18            else if(p>nums[si]){
19                si++;
20            }
21            else{
22                p++;
23                si++;
24            }
25            
26        }
27        long o = (p*(p-1))/2;
28        long pk = ((p+k)*(p+k-1))/2;
29        sum=sum+pk-o;
30        return sum;
31        
32    }
33}