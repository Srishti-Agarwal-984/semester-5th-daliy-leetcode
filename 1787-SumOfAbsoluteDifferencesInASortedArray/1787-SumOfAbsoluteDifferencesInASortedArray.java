// Last updated: 7/31/2025, 5:30:29 PM
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] sum= new int[nums.length];
        sum[0]= nums[0];
        for(int i=1; i<nums.length; i++){
            sum[i] = sum[i-1]+nums[i];


        }
        int n = nums.length-1;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                ans[i]  = sum[n]-sum[i]-(nums[i]*(n-i));
            }
            else{
                ans[i]  = sum[n]-sum[i]-(nums[i]*(n-i));
                ans[i]+=(nums[i]*(i-0))-sum[i-1];
            }
        }
        return ans;
    }
}