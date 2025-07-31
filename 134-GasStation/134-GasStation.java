// Last updated: 7/31/2025, 5:36:41 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a= 0, b=0, m;
        for(int i=0; i<gas.length; i++){
            a=a+gas[i]-cost[i];
            
        }
        if(a<0){
            return -1;
        }
        int in=0;
        for(int i=0; i<cost.length; i++){
            b=b+gas[i]-cost[i];
            if(b<0){
                b=0;
                in=i+1;
            }
        }
        return in;
    }
}