// Last updated: 12/23/2025, 2:00:44 PM
1class Solution {
2    public int wiggleMaxLength(int[] nums) {
3        int ans=0;
4        int[][] dp = new int[nums.length][2];
5        for(int[] p: dp){
6            Arrays.fill(p, -1);
7        }
8        for(int i=0; i<nums.length; i++){
9            for(int j=i+1; j<nums.length; j++){
10                if(nums[i]<nums[j]){
11                    ans = Math.max(helper(j, nums,0, dp)+1, ans);
12                }
13                else if(nums[i]>nums[j]){
14                    ans = Math.max(helper(j, nums,1, dp)+1, ans);
15                }
16            }
17            
18        }
19        return ans+1;
20        
21    }
22    public int helper(int si,  int[] nums, int prev, int[][] dp){
23        if(si==nums.length){
24            return 0;
25        }
26        if(dp[si][prev]!=-1){
27            return dp[si][prev];
28        }
29        int ans=0;
30        for(int i=si+1; i<nums.length; i++){
31            if(prev==1 && nums[si]<nums[i]){
32                ans = Math.max(helper(i, nums,0, dp)+1, ans);
33            }
34            else if(prev==0 && nums[si]>nums[i]){
35                ans = Math.max(helper(i, nums,1, dp)+1, ans);
36            }
37
38        }
39        dp[si][prev]=ans;
40        return ans;
41
42
43    }
44}