// Last updated: 7/31/2025, 5:33:24 PM
class Solution {
    public int repeatedStringMatch(String a, String b) {
        int sb = b.length();
        int sa = a.length();
        int u = sb/sa+2;
        String kl = a;
        int i=1;
        while(i<=u){
            if(a.indexOf(b)>=0){
                return i;
            }
            a=a+kl;
            i++;
        }
        return -1;

        
    }
}