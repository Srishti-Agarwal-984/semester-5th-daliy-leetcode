// Last updated: 7/31/2025, 5:31:03 PM
class Solution {
    public int numSteps(String s) {
        int st=0,cr=0;
        int c=0;
        for(int i=s.length()-1; i>0; i--){
            int bit = s.charAt(i)-'0';
            bit+=cr;
            if(bit==1){
                st+=2;
                cr=1;
            }
            else{
                st++;

            }    
        }
        
        return st+cr;
        
    }
}