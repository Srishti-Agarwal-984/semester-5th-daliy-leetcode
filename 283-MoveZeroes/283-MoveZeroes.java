// Last updated: 7/31/2025, 5:35:22 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int y=0,k=0;
        for(int i=0 ;i<nums.length; i=i+1){
            if (nums[i]!=0){
                arr[k]=nums[i];
                k=k+1;
            }
            else{
                y=y+1;
            }
        }
        int g=arr.length;
        for(int i=g; i<nums.length ;i=i+1){
            arr[g]=0;
        }
        for (int i=0; i<arr.length; i=i+1){
            nums[i]=arr[i];
        }

        
    }
}