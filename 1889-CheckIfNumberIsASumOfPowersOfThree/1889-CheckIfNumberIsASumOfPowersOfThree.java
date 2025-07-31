// Last updated: 7/31/2025, 5:30:16 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){
                return false;
            }
            n=n/3;
        }
        return true;
    }
}