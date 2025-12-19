// Last updated: 12/19/2025, 7:04:00 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int r = nums[0];
4        int i1=0;
5        int ans=1;
6        int max = nums[0];
7        for(int i=1; i<nums.length; i++){
8            if(nums[i]<r){
9                i1++;
10                ans++;
11            }
12            else{
13                i1=0;
14                max = Math.max(max, nums[i]);
15            }
16            if(i1>0){
17                r = max;
18                ans=i+1;
19            }
20        }
21        return ans;
22        
23    }
24}