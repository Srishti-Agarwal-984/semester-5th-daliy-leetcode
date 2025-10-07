// Last updated: 10/7/2025, 11:51:02 AM
class Solution {
    public int minOperations(int[] nums) {
        int op=0;
        int[] dp= new int[nums.length];
        dp[0]=nums[0]==0?1:0;
        op=nums[0]==0?1:0;
        for(int i=1;i<nums.length; i++){
            int a=nums[i];
            if(dp[i-1]%2!=0){
                if(a==1){
                    op++;
                    dp[i]=1;
                }
            }
            else{
                if(a==0){
                    op++;
                    dp[i]=1;
                }
            }
            dp[i]+=dp[i-1];
            //dp[i]=dp[i]%2;
        }
        return op;
    }
}