// Last updated: 7/31/2025, 5:28:41 PM
class Solution {
    public int partitionString(String s) {
        int c=0;
        String sb = "";
        for(int i=0; i<s.length(); i++){
            if(sb.indexOf(s.charAt(i))>=0){
                c++;
                sb = "";
            }
            sb+=(s.charAt(i));

        }
        c++;
        return c;
        
    }
}