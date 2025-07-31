// Last updated: 7/31/2025, 5:38:25 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(nums,0,nums.length);
            return;
        }
        else{
            int q=-1;
            for(int i=n-1; i>p; i--){
                if(nums[i]>nums[p]){
                    q=i;
                    break;
                }
            }
            int temp =nums[p];
            nums[p] = nums[q];
            nums[q]= temp;
            reverse(nums, p+1, n);
        }
    }
    public static void reverse(int[] nums, int i, int e){
        while(i<e){
            int te=nums[i];
            nums[i]=nums[e-1];
            nums[e-1]=te;
            i++;
            e--;
        }
    }
    
}