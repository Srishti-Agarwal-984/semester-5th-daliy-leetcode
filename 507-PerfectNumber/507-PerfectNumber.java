// Last updated: 7/31/2025, 5:34:06 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0, l=1;
        while(l<num){
            if(num%l==0){
                sum=sum+l;
            }
            l++;
        }
        if(sum==num){
            return true;
        }
        return false;
        
    }
}