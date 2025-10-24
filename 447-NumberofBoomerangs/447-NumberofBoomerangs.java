// Last updated: 10/25/2025, 1:27:56 AM
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans=0;

        for(int i=0; i<points.length; i++){
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j=0;j<points.length;j++){
                if(i==j){
                    continue;
                }
                double dist = Math.pow((Math.pow((points[i][0]-points[j][0]),2)+Math.pow((points[i][1]-points[j][1]),2)),0.5);
                map.put(dist, map.getOrDefault(dist,0)+1);
            }
            for(double key : map.keySet()){
                if(map.get(key)>=2){
                    int q = (map.get(key)*(map.get(key)-1));
                    ans+=q;
                }
            }
        }
        return ans;
    }
}