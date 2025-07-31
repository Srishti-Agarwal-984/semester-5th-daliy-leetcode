// Last updated: 7/31/2025, 5:35:29 PM
class Solution {
    public int missingNumber(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<nums.length){
                arr[nums[i]]++;
            }
        }
        int h=0;
        int j=0;
        for(int i=0; i<nums.length; i++){
                if(arr[i]==0){
                    h=i;
                    j=1;
                    break;
                }
        }
        if(j==0){
            h=nums.length;
        }
        return h;


        
    }
}