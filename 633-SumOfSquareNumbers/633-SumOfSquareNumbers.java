// Last updated: 7/31/2025, 5:33:33 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i=0; i*i<=c/2; i++){
            int d =  i*i;
            int p =(int)(Math.pow(c-d,0.5));
            double l = Math.pow(c-d,0.5);
            if(p==l){
                return true;
            }
        }
        return false;
    }
}