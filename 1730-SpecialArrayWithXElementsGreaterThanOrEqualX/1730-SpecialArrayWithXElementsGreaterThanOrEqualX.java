// Last updated: 7/31/2025, 5:30:34 PM
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int y = nums.length-1;
        if(nums[0]==0 && nums[y] == 0){
            return -1;
        }
        int g =-1;
        int i=0;
        y=y+1;
        while(i<=y){
            int mid = i+(y-i)/2;
            int c=0;
            int a =0, l = nums.length-1;
            while(a<=l){
                int mid1 = a+(l-a)/2;
                if(nums[mid1]>=mid){
                    c=nums.length-mid1;
                    l=mid1-1;
                    
                }
                else{
                    a=mid1+1;
                }
            }
            if(c==mid){
                return c;
            }
            else if(c>mid){
                i=mid+1;
            }
            else{
                y = mid-1;
            }
        }
        return -1;
        
    }
}