// Last updated: 7/31/2025, 5:36:03 PM
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int h= nums.length;

        ro(nums, 0, h); 
        ro(nums, 0, k);
        ro(nums, k,h);
    }
    public static void ro(int[] nums, int a,int b){
        int y,j=a,i=b-1;
        while(j<i){
            y=nums[i];
            nums[i]=nums[j];
            nums[j]=y;
            j++;
            i--;
        }
    }
}