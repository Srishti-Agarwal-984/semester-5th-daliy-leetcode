// Last updated: 7/31/2025, 5:30:00 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int i=0, k = nums.length-1;
        int p=-1;
        int c=0;
        while(i<=k){
            if(nums[i]==target){
                if(c==0){
                    p=Math.abs(start-i);
                    c++;
                }
                p=Math.min(Math.abs(start-i), p);
            }
            if(nums[k]==target){
                if(c==0){
                    p=Math.abs(start-k);
                    c++;
                }
                p=Math.min(Math.abs(start-k), p);
            }
            i++;
            k--;
        }
        return p;
        
    }
}