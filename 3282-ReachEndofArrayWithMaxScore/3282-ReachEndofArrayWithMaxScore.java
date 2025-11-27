// Last updated: 11/27/2025, 6:49:03 AM
1class Solution {
2    public long findMaximumScore(List<Integer> nums) {
3        if(nums.size()==1){
4            return 0;
5        }
6        long sum=0l;
7        Stack<Integer> st = new Stack<>();
8        int prev=0;
9        for(int i=1; i<nums.size(); i++){
10            if(nums.get(prev)<nums.get(i)){
11                sum+=(long)nums.get(prev)*(long)(i-prev);
12                prev=i;
13            }
14        }
15        if(prev!=nums.size()-1){
16            sum+=(long)nums.get(prev)*(nums.size()-1-prev);
17        }
18        return sum;
19
20
21    }
22}