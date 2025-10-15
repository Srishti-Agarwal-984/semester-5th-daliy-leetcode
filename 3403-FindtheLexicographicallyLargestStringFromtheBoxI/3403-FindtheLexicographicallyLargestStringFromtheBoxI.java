// Last updated: 10/15/2025, 10:57:18 PM
class Solution {
    public String answerString(String word, int numFriends) {
        int[] freq = new int[26];
        if(numFriends==1){
            return word;
        }
        for(int i=0; i<word.length(); i++){
            freq[word.charAt(i)-'a']++;
        }
        int id=0;
        for(int i=25; i>=0; i--){
            if(freq[i]>=1){
                id=i;
                break;

            }
        }

        int a = word.length()-numFriends+1;
        String ans = "";
        for(int i=0; i<word.length(); i++){
            int a1 = word.charAt(i)-'a';
            if(a1==id){
                if(ans.compareTo(word.substring(i,Math.min(word.length(), i+a)))<0){
                    ans = word.substring(i,Math.min(word.length(), i+a));
                }
            }
        }
        return ans;

    }
}