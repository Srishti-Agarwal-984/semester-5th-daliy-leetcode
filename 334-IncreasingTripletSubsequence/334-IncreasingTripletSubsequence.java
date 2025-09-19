// Last updated: 9/19/2025, 2:55:02 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int len=1;
        for(int i=1; i<nums.length; i++){
            if(dp[len-1]<nums[i]){
                dp[len]=nums[i];
                len++;
            }
            else{
                int idx = Binary_Search(dp, 0, len-1, nums[i]);
                dp[idx]=nums[i];
            }
            if(len>=3){
                return true;
            }
            
        }
        return len>=3;

    }
    public int Binary_Search(int[] dp, int si, int en, int item){
        int ans=0;
        while(si<=en){
            int mid = (en+si)/2;
            if(dp[mid]>=item){
                ans = mid;
                en=mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return ans;
    }
}