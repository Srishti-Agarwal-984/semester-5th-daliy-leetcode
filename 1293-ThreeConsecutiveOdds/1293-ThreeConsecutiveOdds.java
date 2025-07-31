// Last updated: 7/31/2025, 5:31:45 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cn=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                cn++;
            }
            else{
                if(cn>=3){
                    return true;
                }
                cn=0;
            }
            if(cn>=3){
                return true;

            }
        }
        return false;
        
    }
}