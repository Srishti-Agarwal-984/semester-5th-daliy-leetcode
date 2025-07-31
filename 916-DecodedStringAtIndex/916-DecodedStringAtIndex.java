// Last updated: 7/31/2025, 5:32:47 PM
class Solution {
    public String decodeAtIndex(String s, int k) {
        long le =0;
        String j = "";
        for (int i = 0; i < s.length(); i++) {
            int cn = s.charAt(i) - '0';
            if (cn >= 0 && cn <= 9) {
                le= le*cn;
            } else {
                le++;
            }
        }
        for (int i = s.length()-1 ; i>=0; i--) {
            int cn = s.charAt(i) - '0';
            //String kl="";

            if (cn >= 0 && cn <= 9) {
                le=le/cn;
                k%=le;
            } else {
                if (k == 0 || le== k) {
                    return String.valueOf(s.charAt(i)); // Return the kth character as a string
                }
                le--;
            }
        
        }
        return "";

    }
}