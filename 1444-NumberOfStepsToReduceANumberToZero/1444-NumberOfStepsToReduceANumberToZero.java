// Last updated: 7/31/2025, 5:31:17 PM
class Solution {
    public int numberOfSteps(int num) {
        int st=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
            }
            else{
                num--;
            }
            st++;
        }
        return st;
    }
}