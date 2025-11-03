// Last updated: 11/3/2025, 3:34:32 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int r=0;
        int u= neededTime[0];
        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                r=r+Math.min(neededTime[i], neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i], neededTime[i-1]);
            }
        }
        return r;
        
    }
}