// Last updated: 7/31/2025, 5:30:31 PM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int [] y = new int[points.length];
        for(int i=0; i<points.length; i++){
            y[i] = points[i][0];
        }
        Arrays.sort(y);
        int u=0;
        for(int i=0; i<y.length-1; i++){
            u=Math.max(u, y[i+1]-y[i]);
        }
        return u;
        
    }
}
                                                                        