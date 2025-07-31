// Last updated: 7/31/2025, 5:26:35 PM
class Solution {
    public int countPartitions(int[] nums) {
        long sum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        long p=0;
        int y=0;
        for(int i=0; i<nums.length-1; i++){
            p=p+nums[i];
            sum=sum-nums[i];
            if((sum-p)%2==0){
                y++;
            }
            
        }
        return y;
        
    }
}