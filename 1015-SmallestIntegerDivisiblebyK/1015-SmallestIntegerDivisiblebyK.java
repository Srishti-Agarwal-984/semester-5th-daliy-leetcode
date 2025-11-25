// Last updated: 11/25/2025, 10:26:14 AM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0){
            return -1;
        }
        long p=1;
        int c=1;
        while(p%k!=0){
            p=(p%k)*10+1;
            c++;
        }
        return c;
    }
}