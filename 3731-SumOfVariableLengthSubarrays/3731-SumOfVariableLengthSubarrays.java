// Last updated: 7/31/2025, 5:26:25 PM
class Solution {
    public int subarraySum(int[] nums) {
        int u=0;
        int[] as = new int[nums.length];
        as[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            as[i]=as[i-1]+nums[i];
        }
        
        int sum =0;
        for(int i=0; i<nums.length; i++){
            int a=Math.max(0,i-nums[i]);
            if(a==0){
                sum=sum+as[i];
                continue;
            }
            sum=sum+as[i]-as[a-1];
            
        }
        return sum;
        
        
    }
}