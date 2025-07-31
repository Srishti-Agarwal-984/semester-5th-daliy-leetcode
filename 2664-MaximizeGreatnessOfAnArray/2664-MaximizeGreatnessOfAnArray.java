// Last updated: 7/31/2025, 5:28:14 PM
class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[j]<nums[i]){
                c++;
                j++;
            }
        }
        return c;
    }
}