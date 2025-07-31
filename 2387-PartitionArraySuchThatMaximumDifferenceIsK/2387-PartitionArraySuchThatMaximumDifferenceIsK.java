// Last updated: 7/31/2025, 5:28:58 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int si=0;
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-nums[si]<=k){
                continue;
            }
            else{
                c++;
                si=i;
            }
        }
        return c+1;
    }
}