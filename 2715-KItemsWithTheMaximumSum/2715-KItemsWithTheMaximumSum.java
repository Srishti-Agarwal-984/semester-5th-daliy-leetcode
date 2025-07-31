// Last updated: 7/31/2025, 5:28:08 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int s=numOnes;
        int b=numZeros;
        int y=0;
        if(k<=s){
            y=k;
        }
        if(k>s && k<=s+b){
            y=s;
        }
        if(k>s+b){
            int a=k-(s+b);
            y= s-a;
        }
        return y;
    }
}