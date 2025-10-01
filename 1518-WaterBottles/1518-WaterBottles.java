// Last updated: 10/1/2025, 4:51:39 PM
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