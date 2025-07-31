// Last updated: 7/31/2025, 5:28:51 PM
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=0; i<nums.length; i++){
            int y=i+1, m=nums.length-1;
            int p=0;
            while(y<=m){
                int mid = y+(m-y)/2;
                if(nums[mid] == nums[i]+diff){
                    p=1;
                    break;
                }
                else if(nums[mid]>(nums[i]+diff)){
                    m=mid-1;
                }
                else{
                    y= mid+1;
                }
            }
            if(p==1){
                p=0;
                y=i+1;
                m=nums.length-1;
                while(y<=m){
                    int mid = y+(m-y)/2;
                    if(nums[mid] == nums[i]+diff+diff){
                        p=1;
                        break;
                    }
                    else if(nums[mid]>(nums[i]+diff+diff)){
                        m=mid-1;
                    }
                    else{
                        y= mid+1;
                    }
                }
                if(p==1){
                    c++;
                }
                
            }
        }
        return c;
        
    }
}