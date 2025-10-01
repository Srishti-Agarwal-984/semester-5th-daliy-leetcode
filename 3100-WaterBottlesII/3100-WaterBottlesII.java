// Last updated: 10/1/2025, 4:51:10 PM
class Solution {
    public int maxBottlesDrunk(int numbottles, int numExchange) {
        int sum=numbottles;
        while(numbottles>=numExchange){
            sum=sum+1;
            numbottles=numbottles-numExchange+1;
            numExchange++;

        }
        return sum;
    }
}