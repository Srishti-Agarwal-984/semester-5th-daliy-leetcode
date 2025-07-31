// Last updated: 7/31/2025, 5:27:39 PM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] ar = new int[n/3][3];
        boolean fg = true;
        for(int i=0; i<nums.length-2; i=i+3){
            int s = nums[i+2]-nums[i];
            if(s<=k){
                ar[i/3][0]=nums[i];
                ar[i/3][1]=nums[i+1];
                ar[i/3][2]=nums[i+2];
            }
            else{
                return new int[0][0];
            }
        }
        return ar;
    }
}
