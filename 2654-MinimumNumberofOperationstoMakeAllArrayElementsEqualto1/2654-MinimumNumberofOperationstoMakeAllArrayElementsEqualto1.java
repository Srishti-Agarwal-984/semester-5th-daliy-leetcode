// Last updated: 11/12/2025, 6:27:11 AM
class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int el: nums){
            if(el==1){
                c++;
            }
        }
        if(c>0){
            return nums.length-c;
        }
        for(int i=0; i<nums.length-1; i++){
            int r = gcd(nums[i], nums[i+1]);
            //nums[i+1]=r;
            if(r==1){
                return nums.length;
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<nums.length-1; i++){
            int g=nums[i];
            for(int j=i+1; j<nums.length; j++){
                g= gcd(g, nums[j]);
                if(g==1){
                    ans=Math.min(ans, j-i+nums.length-1);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
    public int gcd(int a, int b){
        
        return b==0?a:gcd(b,a%b);
    }
}