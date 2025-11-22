// Last updated: 11/22/2025, 8:20:20 PM
class Solution {
    public int minimumFlips(int n) {
        String s="";
        while(n!=0){
            s=s+(n%2);
            n=n/2;
        }
        int c=0;
        int si=s.length()-1, en=0;
        while(en<=si){
            if(s.charAt(en)!=s.charAt(si)){
                c+=2;
            }
            en++;
            si--;
        }
        return c;
        
    }
}