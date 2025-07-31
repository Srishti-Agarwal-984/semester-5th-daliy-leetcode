// Last updated: 7/31/2025, 5:36:02 PM
class Solution {
    public int hammingWeight(int n) {
        int y=0;
        // n=n/2;
        while(n>0){
            int p=n%2;
            if(p==1){
                y++;
            }
            n=n/2;
        }
        return y;
    }
}