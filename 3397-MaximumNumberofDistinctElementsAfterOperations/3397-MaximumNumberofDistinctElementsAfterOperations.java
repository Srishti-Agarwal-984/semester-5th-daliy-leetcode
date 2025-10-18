// Last updated: 10/18/2025, 6:29:53 PM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int prev=nums[0]-k;
        int cn=1;
        for(int i=1;i<nums.length; i++){
            int a=nums[i]-k;
            int b=nums[i]+k;
            if(prev<a){
                prev=a;
                cn++;
            }
            else{
                if(prev<b && prev>=a){
                    prev=prev+1;
                    cn++;
                }
            }
        }
        return cn;
    }
}