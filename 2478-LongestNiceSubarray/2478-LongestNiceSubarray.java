// Last updated: 7/31/2025, 5:28:44 PM
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int a=1;
        int i=0, n=nums.length, si=0;
        int or1=nums[i];
        int an = or1 & nums[i];
        while(i<n){
            an = or1 & nums[i];
            while(si<i && (an!=0)){
                or1=or1^nums[si];
                an=or1 & nums[i];
                si++;
            }
            or1=or1|nums[i];
            a=Math.max(a,i-si+1);
            i++;
        }
        return a;
        
    }
}