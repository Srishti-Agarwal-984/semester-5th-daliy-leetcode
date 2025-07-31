// Last updated: 7/31/2025, 5:29:33 PM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
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
        ArrayList<Integer> ab = new ArrayList<Integer>();
        if(arr[0]==-1){
            return ab;
        }
        int yu=arr[0];
        while(yu<=arr[1]){
            ab.add(yu);
            yu++;
        }
        
        return ab;
    }
    
}