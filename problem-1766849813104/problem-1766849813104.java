// Last updated: 12/27/2025, 9:06:53 PM
1class Solution {
2    public int smallestRangeII(int[] nums, int k) {
3        // if(nums.length==1){
4        //     return 0;
5        // }
6        Arrays.sort(nums);
7        int ans = nums[nums.length-1]-nums[0];
8        for(int i=0; i<nums.length-1; i++){
9            int max = Math.max(nums[nums.length-1]-k, nums[i]+k);
10            int min = Math.min(nums[0]+k, nums[i+1]-k);
11            ans = Math.min(ans, max-min);
12        }
13        return ans;
14
15        
16    }
17    
18
19
20}