// Last updated: 7/31/2025, 5:31:21 PM
class Solution {
    public int findNumbers(int[] nums) {
        int cn =0;
        for(int i=0; i<nums.length; i++){
            //String hj = ""+nums[i];
            int kl = 0;
            while(nums[i]>0){
                nums[i]/=10;
                kl++;
            }
            if(kl%2==0){
                cn++;
            }
        }
        return cn;

    }
}