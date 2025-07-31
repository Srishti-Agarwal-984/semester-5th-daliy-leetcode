// Last updated: 7/31/2025, 5:31:42 PM
class Solution {
    public int minMoves(int target, int maxDoubles) {
        int st=0;
        while(maxDoubles!=0 && target!=1){
            if(target%2!=0){
                target--;
            }
            else{
                target/=2;
                maxDoubles--;
            }
            st++;

        }
        st+=target-1;
        return st;
        
        
    }
}