// Last updated: 7/31/2025, 5:27:28 PM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c=1, an1=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
            else{
                an1=Math.max(an1,c);
                //System.out.println(an1);
                c=1;
            }
        }
        an1=Math.max(an1,c);
        c=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                c++;
            }
            else{
                an1=Math.max(an1,c);
                c=1;
            }
        }
        an1=Math.max(an1,c);
        return an1;
        
    }
}