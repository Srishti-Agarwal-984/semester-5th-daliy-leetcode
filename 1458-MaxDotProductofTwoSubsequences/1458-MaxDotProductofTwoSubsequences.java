// Last updated: 10/30/2025, 12:06:41 PM
class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int[] a: dp){
            Arrays.fill(a,Integer.MIN_VALUE);
        }
        return helper(0,0, dp, nums1, nums2);
    }
    public int helper(int i, int j, int[][] dp, int[] nums1, int[] nums2){
        if(i>=nums1.length || j>=nums2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=Integer.MIN_VALUE){
            return dp[i][j];
        }
        int a = nums1[i]*nums2[j];
        int inc = helper(i+1, j+1, dp, nums1, nums2)+ (a>=0? a: 0);
        int exc = Math.max(helper(i+1, j, dp, nums1, nums2), helper(i, j+1, dp, nums1, nums2));
        return dp[i][j] = Math.max(inc, Math.max(exc, a));


    }
}