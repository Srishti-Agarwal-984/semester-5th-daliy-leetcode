// Last updated: 7/31/2025, 5:25:34 PM
class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if (ch == '%') {
                sb.reverse(); // just reverse the content
            } 
            else if (ch == '*') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } 
            else if (ch == '#') {
                StringBuilder temp = new StringBuilder(sb); // make a copy
                sb.append(temp.toString());
            } 
            else if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            } 
            else {
                continue;
            }
        }

        return sb.toString();
    }
}
