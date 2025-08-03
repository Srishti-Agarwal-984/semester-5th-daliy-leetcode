// Last updated: 8/3/2025, 10:15:17 AM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length; 
        int i=0;
        int count=0;
        while(i<n){
            int curr = weight[i];
            int si=i+1;
            boolean u=false;
            while(si<n){
                curr = Math.max(curr, weight[si]);
                if(curr>weight[si]){
                    count++;
                    i=si;
                    u=true;
                    break;
                }
                si++;
            }
            if(!u){
                break;
            }
            i++;
        }
        return count;
        
    }
}