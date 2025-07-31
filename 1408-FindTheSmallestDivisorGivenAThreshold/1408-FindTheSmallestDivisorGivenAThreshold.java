// Last updated: 7/31/2025, 5:31:24 PM
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int si=1,en = nums[nums.length-1];
        int ans = Integer.MAX_VALUE;
        while(si<=en){
            int mid = si+(en-si)/2;
            int sum=0;
            for(int i=0; i<nums.length; i++){
                sum+=nums[i]/mid;
                if(nums[i]%mid!=0){
                    sum++;
                }
            }
            if(sum<=threshold){
                ans=Math.min(ans, mid);
                en = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return ans;
    }
}