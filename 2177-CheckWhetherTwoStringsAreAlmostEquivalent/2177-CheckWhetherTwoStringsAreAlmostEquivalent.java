// Last updated: 7/31/2025, 5:29:38 PM
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i=0; i<word1.length(); i++){
            a[word1.charAt(i)-'a']++;
        }
        for(int i=0; i<word2.length(); i++){
            b[word2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            a[i]=a[i]-b[i];
            if(a[i]>3 || a[i]<-3){
                return false;

            }
        }
        return true;
    }
}