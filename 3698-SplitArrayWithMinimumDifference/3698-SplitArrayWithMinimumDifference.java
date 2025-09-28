// Last updated: 9/28/2025, 10:12:26 AM
class Solution {
    public long splitArray(int[] nums) {
        int si=0;
        long sum=0, l=0;
        for(si=0; si<nums.length-1; si++){
            if(nums[si]<nums[si+1]){
                sum+=nums[si];
            }
            else{
                break;
            }
        }
        int r=si;
        long p=0;
        if(si+1!=nums.length && nums[si]==nums[si+1]){
            r++;

        }
        for(int i=r; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                System.out.println(nums[i]);
                p+=nums[i+1];
            }
            else{
                return -1;
            }
            
        }
        long ans= Math.min(Math.abs(sum+nums[r]-p), Math.abs(sum-nums[r]-p));
        if(r!=si){
            ans=Math.abs(sum-p);

        }
        return ans;
    }
}