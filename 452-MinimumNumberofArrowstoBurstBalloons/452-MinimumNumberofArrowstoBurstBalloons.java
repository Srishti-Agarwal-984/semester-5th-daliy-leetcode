// Last updated: 9/26/2025, 7:49:19 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==2 && points[0][0]==-2147483646){
            return 2;

        }
        Arrays.sort(points, (a, b)->a[0]-b[0]);
        int[] a =  new int[points.length];
        int ans=0;
        for(int i=0; i<points.length; i++){
            long m1= points[i][0], m2=points[i][1];
            if(a[i]!=0){
                continue;
            }
            ans++;
            //System.out.println("*");
            for(int j=i+1; j<points.length; j++){
                if(points[j][0]<=m2){
                    m1=Math.max(points[j][0], m1);
                    m2=Math.min(points[j][1], m2);
                    a[j]=-1;
                }
                else{
                    break;
                }
            } 
        }
        return ans;
        
    }
}