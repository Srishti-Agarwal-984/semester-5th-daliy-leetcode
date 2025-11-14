// Last updated: 11/14/2025, 4:41:57 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] arr = new int[10001];
        for(int el:nums){
            arr[el]++;
        }
        int[] dp = new int[arr.length+1];
        dp[0]=0;
        dp[1]=Math.max(dp[0],1*arr[1]);
        for(int i=2; i<arr.length; i++){
            int r = dp[i-2]+arr[i]*i;
            dp[i]=Math.max(r, dp[i-1]);
        }
        return dp[arr.length-1];
        
    }
    
    
}