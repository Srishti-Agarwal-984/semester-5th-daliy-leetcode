// Last updated: 11/1/2025, 8:00:10 AM
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