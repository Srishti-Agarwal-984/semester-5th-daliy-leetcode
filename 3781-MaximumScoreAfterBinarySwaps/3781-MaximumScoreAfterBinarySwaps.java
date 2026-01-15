// Last updated: 1/15/2026, 3:46:07 PM
1class Solution {
2    public long maximumScore(int[] nums, String s) {
3        PriorityQueue<Integer> pq =new PriorityQueue<>((a, b)->b-a);
4        long sum=0;
5        for(int i=0; i<nums.length; i++){
6            if(s.charAt(i)=='0'){
7                pq.add(nums[i]);
8            }
9            else{
10                if(pq.isEmpty()){
11                    sum=sum+nums[i];
12                }
13                else{
14                    pq.add(nums[i]);
15                    sum = sum+pq.poll();
16                    //pq =new PriorityQueue<>();
17                }
18            }
19        }
20        return sum;
21
22    }
23}