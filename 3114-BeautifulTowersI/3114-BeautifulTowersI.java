// Last updated: 7/31/2025, 5:27:50 PM
class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long sum=0;
        for(int i=0; i<heights.length; i++){
            int y=i-1, l=i+1;
            int min  = heights[i];
            long p=min;
            while(l<heights.length){
                min= Math.min(min, heights[l]);
                p=p+min;
                l++;
            }
            min  = heights[i];
            while(y>=0){
                min= Math.min(min, heights[y]);
                p=p+min;
                y--;
            }
            sum=Math.max(sum, p);
        }
        return sum;
        
        

        
    }
}