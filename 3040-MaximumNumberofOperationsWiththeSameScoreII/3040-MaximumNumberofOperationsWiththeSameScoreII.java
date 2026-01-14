// Last updated: 1/14/2026, 11:57:42 AM
1class Solution {
2
3    public int maxOperations(int[] nums) {
4        int[][] dp = new int[nums.length][nums.length];
5        return helper(nums, 0, nums.length-1, -1, dp);
6    }
7    public int helper(int[] nums, int si, int en, int prev, int[][] dp){
8        if(si>=en){
9            return 0;
10        }
11        //sb.append(prev);
12        if(dp[si][en]!=0){
13            return dp[si][en];
14        }
15        int ans = 0;
16        int op1=0, op2=0, op3=0;
17        if(prev==-1 || prev==nums[si]+nums[si+1]){
18            op1=1+helper(nums, si+2, en,nums[si]+nums[si+1] , dp);
19        }
20        if(prev==-1 || prev==nums[si]+nums[en]){
21            op2=1+helper(nums, si+1, en-1,nums[si]+nums[en], dp );
22        }
23        if(prev==-1 || prev==nums[en]+nums[en-1]){
24            op3=1+helper(nums, si, en-2, nums[en]+nums[en-1], dp);
25        }
26        ans = Math.max(op1, Math.max(op2, op3));
27       // dp.put(sb.toString(), ans);
28        return dp[si][en]= ans;
29    }
30}