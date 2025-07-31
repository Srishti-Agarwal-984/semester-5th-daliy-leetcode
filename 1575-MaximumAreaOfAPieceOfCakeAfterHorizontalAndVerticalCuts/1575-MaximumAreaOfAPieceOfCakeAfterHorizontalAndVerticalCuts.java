// Last updated: 7/31/2025, 5:30:50 PM
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int k = (int)(Math.pow(10,9))+7;
        long y=(horizontalCuts[0]-0);
        // h=h%k;
        // w=w%k;
        
        for(int i=1; i<horizontalCuts.length; i++){
            y=(Math.max((horizontalCuts[i]-horizontalCuts[i-1]), y));
            
        }

        y=(Math.max((h-horizontalCuts[horizontalCuts.length-1]), y));
        long x=(verticalCuts[0]-0);
        for(int i=1; i<verticalCuts.length; i++){
            x=(Math.max((verticalCuts[i]-verticalCuts[i-1]), x));
        }

        x=(Math.max((w-verticalCuts[verticalCuts.length-1]), x));
        
        
        return (int)((x*y)%k);
    
    }
}