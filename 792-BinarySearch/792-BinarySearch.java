// Last updated: 7/31/2025, 5:33:06 PM
class Solution {
    public int search(int[] nums, int target) {
       int s=nums.length-1;
       int h=0;
       while(h<=s){
        if (target==nums[h]){
            return h;
        }
        if(target==nums[s]){
            return s;
        }
        h=h+1;
        s=s-1;
       }
       int m=-1;
       return m;
    }
}