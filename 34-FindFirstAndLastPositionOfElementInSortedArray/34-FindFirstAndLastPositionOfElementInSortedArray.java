// Last updated: 7/31/2025, 5:38:19 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int i=0, m=nums.length-1;
        while(i<=m){
            int mid = i+(m-i)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                m=mid-1;
            }
            else if(nums[mid]>target){
                m=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        i=0;
        m=nums.length-1;
        while(i<=m){
            int mid = i+(m-i)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                i=mid+1;
            }
            else if(nums[mid]>target){
                m=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return arr;
    }
    
}