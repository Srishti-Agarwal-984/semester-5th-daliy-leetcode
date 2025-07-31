// Last updated: 7/31/2025, 5:34:29 PM
class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int cn = 1;
        int i = 0;
        for (i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                cn++;
            } else {
                ans = ans + chars[i];
                if (cn > 1) {
                    ans = ans + String.valueOf(cn);
                }
                cn = 1;
            }

        }
        ans = ans + chars[i];
        if (cn > 1) {
            ans = ans + String.valueOf(cn);
        }
        
        cn = 1;
        //chars = new char[ans.length()];
        for(int i1=0; i1<ans.length(); i1++){
            chars[i1]=ans.charAt(i1);
            //System.out.println(chars[i1]);

        }
        return ans.length();

    }
}