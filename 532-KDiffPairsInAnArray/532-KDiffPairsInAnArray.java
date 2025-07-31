// Last updated: 7/31/2025, 5:33:57 PM
class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int y=0;
        for(int i=0; i<nums.length-1; i++){
            int n = nums.length-1, j=i+1;
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int p= nums[i]+k;
            while(j<=n){
                int mid= j+(n-j)/2;
                if(nums[mid]==p){
                    y++;
                    break;
                }
                else if(nums[mid]>p){
                    n=mid-1;
                }
                else{
                    j=mid+1;
                }
            }

        }
        
        return y;
        

    }
}