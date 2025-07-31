// Last updated: 7/31/2025, 5:27:33 PM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int i=0; i<apple.length; i++){
            sum=sum+ apple[i];
        }
        int g=0, k=0;
        for(int i=capacity.length-1; i>=0; i--){
            k=k+capacity[i];
            g=g+1;
            if(k>=sum){
                break;
            }

        }
        return g;
        
    }
}