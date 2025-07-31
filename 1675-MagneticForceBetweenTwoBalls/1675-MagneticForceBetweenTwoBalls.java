// Last updated: 7/31/2025, 5:30:39 PM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low =0;
        int hi = position[position.length-1]-position[0];
        int an =0;
        while(low<=hi){
            int mid = low+(hi-low)/2;
            if(ans(mid, position, m)){
                an = mid;
                low = mid+1;
            }
            else{
                hi= mid-1;
            }
        }
        return an;
        
    }
    public static boolean ans(int yu, int[] position, int m){
        int po = position[0], p1 =1;
        for(int i=1; i<position.length; i++){
            if(position[i]-po>=yu){
                p1++;
                po= position[i];
            }
            if(p1==m){
                return true;
            }
        }
        return false;
    }
}