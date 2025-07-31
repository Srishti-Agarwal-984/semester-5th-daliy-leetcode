// Last updated: 7/31/2025, 5:35:21 PM
class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        int [] a = new int[nums.length];
        int c=0;
        for(int i=0; i<nums.length; i++){
            a[nums[i]]++;
            if(a[nums[i]]>1){
                c=nums[i];
                break;
            }
        }
        return c;
        
    }
}