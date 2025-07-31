// Last updated: 7/31/2025, 5:34:53 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // int [] rans = new int[26];
        int [] mag = new int[26];
        for(int i=0; i<magazine.length(); i++){
            int a = magazine.charAt(i)-'a';
            mag[a]++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            int a = ransomNote.charAt(i)-'a';
            mag[a]--;
            if(mag[a]<0){
                return false;
            }
        }
        return true;
        
        
    }
}