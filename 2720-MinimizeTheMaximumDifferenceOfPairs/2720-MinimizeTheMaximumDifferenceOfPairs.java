// Last updated: 7/31/2025, 5:28:03 PM
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        if(p==0 ||nums.length==1){
            return 0;
        }
        int en = nums[nums.length-1]-nums[0];
        int ans =  en;
        int si=0;
        //boolean[] qw = new boolean[nums.length];
        while(si<=en){
            int mid = si+(en-si)/2;
            
            if(helper(mid,p,nums)){
                ans=Math.min(ans, mid);
                en= mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return ans;
    }
    public boolean helper(int mid, int p, int[] nums){
        int c=0;


        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]<=mid){
                c++;
                i++;
            }
            if(c>=p){
                return true;
            }
        }
        if(c>=p){
            return true;
        }
        return false;
    }
}