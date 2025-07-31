// Last updated: 7/31/2025, 5:27:32 PM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // int nb = numBottles;
        // int ne = numExchange;
        int c=0;
        while(numBottles>=numExchange){
            c=c+numExchange;
            // System.out.println(c);
            numBottles+=1-numExchange;
            numExchange++;
        }
        // System.out.println(c);
        c=c+numBottles;
        return c;
        
    }
}