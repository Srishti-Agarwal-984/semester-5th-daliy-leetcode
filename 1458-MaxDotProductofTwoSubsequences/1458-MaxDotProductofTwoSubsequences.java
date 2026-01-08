// Last updated: 1/8/2026, 8:27:32 AM
1class Solution {
2    public int maxDotProduct(int[] nums1, int[] nums2) {
3        int[][] dp = new int[nums1.length][nums2.length];
4        for(int[] a: dp){
5            Arrays.fill(a,Integer.MIN_VALUE);
6        }
7        return helper(0,0, dp, nums1, nums2);
8    }
9    public int helper(int i, int j, int[][] dp, int[] nums1, int[] nums2){
10        if(i>=nums1.length || j>=nums2.length){
11            return Integer.MIN_VALUE;
12        }
13        if(dp[i][j]!=Integer.MIN_VALUE){
14            return dp[i][j];
15        }
16        int a = nums1[i]*nums2[j];
17        int inc = helper(i+1, j+1, dp, nums1, nums2)+ (a>=0? a: 0);
18        int exc = Math.max(helper(i+1, j, dp, nums1, nums2), helper(i, j+1, dp, nums1, nums2));
19        return dp[i][j] = Math.max(inc, Math.max(exc, a));
20
21
22    }
23}