// Last updated: 7/31/2025, 5:38:29 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int [] arr = new int[nums.length];
        int j=0;
        arr[j] = nums[0];
        j++;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                c++;
                arr[j] = nums[i];
                j++;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        return c ;
        
    }
}