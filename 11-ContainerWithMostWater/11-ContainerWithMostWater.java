// Last updated: 7/31/2025, 5:38:45 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0, k=height.length-1;
        int r=0;
        while(i<k){
            if(height[i]<height[k]){
                r=Math.max(r,height[i]*(k-i));
                i++;
            }
            else{
                r=Math.max(r,height[k]*(k-i));
                k--;
            }
        }
        return r;
        
    }
}