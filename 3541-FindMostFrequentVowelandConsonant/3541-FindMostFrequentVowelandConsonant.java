// Last updated: 9/13/2025, 5:31:22 AM
class Solution {
    public int maxFreqSum(String s) {
        int[] ar = new int[26];
        for(int i=0; i<s.length(); i++){
            ar[s.charAt(i)-'a']++;
        }
        int y=0, l=0;
        String kl = "aeiou";
        for(int i=0; i<s.length(); i++){
            if(kl.indexOf(s.charAt(i))>=0){
                y=Math.max(ar[s.charAt(i)-'a'],y);
            }
            else{
                l=Math.max(ar[s.charAt(i)-'a'],l);
            }
        }
        return y+l;
        
        
    }
}