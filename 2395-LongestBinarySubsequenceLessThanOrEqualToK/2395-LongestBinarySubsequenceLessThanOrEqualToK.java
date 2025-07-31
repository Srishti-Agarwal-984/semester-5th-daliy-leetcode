// Last updated: 7/31/2025, 5:28:55 PM
class Solution {
    public int longestSubsequence(String s, int k) {
        int ans=0;
        int zone =0;
        int zn=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zn++;
            }
        }
        long pow=1;
        long value=0;
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                if(value+pow>k){
                    continue;
                }
                value+=pow;
                zone++;
            }
            pow=pow*2;
            if(pow>k){
                break;

            }

        }
        return zn+zone;
    }
}