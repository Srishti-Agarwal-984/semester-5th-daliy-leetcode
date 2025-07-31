// Last updated: 7/31/2025, 5:30:41 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c=0;
        while(numBottles>=numExchange){
            c=c+numExchange;
            // System.out.println(c);
            numBottles+=1-numExchange;
        }
        // System.out.println(c);
        c=c+numBottles;
        return c;
        
    }
}