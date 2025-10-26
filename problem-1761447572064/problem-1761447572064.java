// Last updated: 10/26/2025, 8:29:32 AM
class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='0'){
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        return Long.parseLong(s);
    }
}