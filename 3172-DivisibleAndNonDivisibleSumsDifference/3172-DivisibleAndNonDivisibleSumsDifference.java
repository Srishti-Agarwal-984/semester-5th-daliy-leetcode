// Last updated: 7/31/2025, 5:27:44 PM
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=(n*(n+1))/2, num2=0;
        while(n>0){
            if(n%m==0){
                num2+=n;
            }
            n--;
        }
        return num1-(num2*2);
        
    }
}