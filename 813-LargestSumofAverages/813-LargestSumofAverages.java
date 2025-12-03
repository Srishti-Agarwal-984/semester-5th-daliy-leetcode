// Last updated: 12/3/2025, 8:17:53 AM
1class Solution {
2    public double largestSumOfAverages(int[] nums, int k) {
3        double[][] dp = new double[nums.length][k+1];
4        for(double[] p:dp){
5            Arrays.fill(p, -1);
6        }
7        return helper(nums, k, 0, dp);
8    }
9    public double helper(int[] nums, int k, int i,double[][] dp ){
10        if(i>=nums.length){
11            return 0;
12        }
13        if(k==0){
14            return Integer.MIN_VALUE;
15        }
16        if(dp[i][k]!=-1){
17            return dp[i][k];
18        }
19        double r=0.0;
20        double sum=0.0;
21        for(int j=i; j<nums.length; j++){
22            sum+=nums[j];
23            double avg= sum/(j-i+1);
24            double call = helper(nums, k-1, j+1, dp);
25            r = Math.max(r, avg+call);
26        }
27        return dp[i][k]=r;
28    }
29}