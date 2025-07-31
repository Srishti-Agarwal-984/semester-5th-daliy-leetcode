// Last updated: 7/31/2025, 5:28:56 PM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int i=0,si=0;
        long sum=0;
        long ans =0;
        while(i<nums.length){
            sum+=nums[i];
            while(sum*(i-si+1)>=k && si<=i){
                sum=sum-nums[si];
                si++;
            }
            ans+=i-si+1;
            i++;
        }
        return ans;

    }
}