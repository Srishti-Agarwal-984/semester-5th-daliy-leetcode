// Last updated: 7/31/2025, 5:29:22 PM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long ma1 = mass;
        if(ma1>=asteroids[asteroids.length-1]){
            return true;
        }
        for(int i=0; i<asteroids.length; i++){
            if(asteroids[i]>ma1){
                return false;
            }
            ma1+=asteroids[i];
            if(ma1>=asteroids[asteroids.length-1]){
                return true;
            }
        }
        return true;
        
    }
}