// Last updated: 12/5/2025, 12:10:39 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        long sum=0;
4        for(int i=0; i<nums.length; i++){
5            sum=sum+nums[i];
6        }
7        long p=0;
8        int y=0;
9        for(int i=0; i<nums.length-1; i++){
10            p=p+nums[i];
11            sum=sum-nums[i];
12            if((sum-p)%2==0){
13                y++;
14            }
15            
16        }
17        return y;
18        
19    }
20}