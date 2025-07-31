// Last updated: 7/31/2025, 5:26:10 PM
class Solution {
    public int maxSum(int[] nums) {
        int sum=0;
        int ar1 = -100;
        List<Integer> ar = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(ar.indexOf(nums[i])<0 && nums[i]>=0){
                ar.add(nums[i]);
                sum+=nums[i];
                
            }
            ar1=Math.max(ar1,nums[i]);
        }
        if(ar.size()==0){
            return ar1;
        }
        return sum;
        
        
    }
}